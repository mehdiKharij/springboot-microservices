package com.example.project.Entity;

import jakarta.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prix;



    // Getter pour 'id'
    public Long getId() {
        return id;
    }

    // Setter pour 'id'
    public void setId(Long id) {
        this.id = id;
    }

    // Getter pour 'nom'
    public String getNom() {
        return nom;
    }

    // Setter pour 'nom'
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour 'prix'
    public String getPrix() {
        return prix;
    }

    // Setter pour 'prix'
    public void setPrix(String prix) {
        this.prix = prix;
    }

    public Produit() {
        // Ce constructeur est généré automatiquement
    }

    // Constructeur avec tous les arguments (généré par Lombok @AllArgsConstructor)
    public Produit( String nom, String prix) {

        this.nom = nom;
        this.prix = prix;
    }

}
