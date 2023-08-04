package com.example.eventservice.service;

import com.example.eventservice.model.BaseMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final KafkaTemplate kafkaTemplate;

    public void send(BaseMessage baseMessage) {
        kafkaTemplate.send(baseMessage.getTopic(), baseMessage);
    }
}
