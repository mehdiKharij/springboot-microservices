package com.example.customerservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;


@Slf4j
@Component
public class CustomerConsumer {

    @KafkaListener(topics = "${topic.name}", groupId = "customer-group")
    public void consume(String message) {
        log.info("📥 Message reçu: {}", message);
    }
}
