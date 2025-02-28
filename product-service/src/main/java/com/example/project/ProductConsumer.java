package com.example.project;


import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;


@Service
public class ProductConsumer {

    @KafkaListener(topics = "customer-topic", groupId = "my-group")
    public void listenCustomerEvents(String message) {
        System.out.println("🚀 Nouveau client reçu via Kafka : " + message);

        // Tu peux ajouter ici une logique métier, par exemple, notifier un admin, mettre à jour un produit, etc.
    }
}
