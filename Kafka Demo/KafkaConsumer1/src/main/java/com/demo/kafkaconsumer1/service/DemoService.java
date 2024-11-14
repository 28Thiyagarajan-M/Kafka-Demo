package com.demo.kafkaconsumer1.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @KafkaListener(topics = "test", groupId = "group_id_1")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}