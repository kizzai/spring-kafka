package com.example.kafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private static final String  TOPIC = "test_topic2";

    public void sendMessage(String message) {
        this.kafkaTemplate.send(TOPIC,message);
    }

}
