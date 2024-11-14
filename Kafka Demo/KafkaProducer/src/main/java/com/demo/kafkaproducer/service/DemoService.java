package com.demo.kafkaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;


    public boolean sendMessage(String message) {
        kafkaTemplate.send("test", message);
        return true;
    }
}
