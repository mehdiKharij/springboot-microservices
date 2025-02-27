package com.example.project;

import com.example.project.Entity.Produit;
import com.example.project.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class ProjectApplication  {


    @Autowired
    private ProduitRepository produitRepository;



    public static void main(String[] args) {

        SpringApplication.run(ProjectApplication.class, args);

    }


    @Bean
    CommandLineRunner runner(){
        return args -> {

            produitRepository.save(new Produit("Produit A", "200"));
            produitRepository.save(new Produit("Produit B", "300"));


        };

    }
}




