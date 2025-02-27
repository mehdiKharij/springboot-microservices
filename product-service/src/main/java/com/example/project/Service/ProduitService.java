package com.example.project.Service;

import com.example.project.Entity.Produit;
import com.example.project.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    // Ajouter un produit
    public Produit saveProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    // Obtenir tous les produits
    public Iterable<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    // Obtenir un produit par ID
    public Optional<Produit> getProduitById(Long id) {
        return produitRepository.findById(id);
    }

    // Supprimer un produit
    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }

    // Mettre à jour un produit
    public Produit updateProduit(Long id, Produit produit) {
        if (produitRepository.existsById(id)) {
            produit.setId(id);
            return produitRepository.save(produit);
        }
        return null; // Retourner null si le produit n'existe pas
    }
}
