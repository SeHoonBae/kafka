package com.example.kafka.controller;

import com.example.kafka.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {
    private final KafkaProducer producer;

    // post 방식으로 message 데이터를 받아서 Producer 서비스로 전달
    @PostMapping
    public String sendMessage(@RequestParam("message") String message){
        this.producer.sendMessage(message);

        return "success";
    }

}
