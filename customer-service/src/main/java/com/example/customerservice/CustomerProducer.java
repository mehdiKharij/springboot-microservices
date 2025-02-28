package com.example.customerservice;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CustomerProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public CustomerProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendCustomerCreatedEvent(String customerData) {
        kafkaTemplate.send("customer-topic", customerData);
    }
}
