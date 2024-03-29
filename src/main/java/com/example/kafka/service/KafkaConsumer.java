package com.example.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

// exam이라는 Topic에서 consumer의 group id가 foo로 데이터를 받아옴
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "exam", groupId = "foo")
    public void consume(String message) throws IOException {
        System.out.println(String.format("Consumed message: %s", message));
    }
}