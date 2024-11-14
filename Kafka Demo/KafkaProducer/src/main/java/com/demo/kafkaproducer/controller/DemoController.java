package com.demo.kafkaproducer.controller;

import com.demo.kafkaproducer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message) {
        demoService.sendMessage(message);
        return message;
    }
}
