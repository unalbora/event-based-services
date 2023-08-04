package com.example.eventservice.service;

import com.example.eventservice.model.ClassifiedMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

public abstract class ListenerService {

    public abstract void handleClassified(ClassifiedMessage classifiedMessage);

    @KafkaListener(topics = "classified-topic")
    public void listen(@Payload ClassifiedMessage classifiedMessage) {
        String message = String.format("Message received.. Message: %s", classifiedMessage.getMessage());
        System.out.println(message);
        handleClassified(classifiedMessage);
    }
}
