package com.example.eventservice.controller;

import com.example.eventservice.model.ClassifiedMessage;
import com.example.eventservice.model.MessageDTO;
import com.example.eventservice.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventController {

    private final ProducerService producerService;

    @PostMapping
    public void sendMessage(@RequestBody MessageDTO messageDTO) {
        ClassifiedMessage classifiedMessage = new ClassifiedMessage();
        classifiedMessage.setTopic("classified-topic");
        classifiedMessage.setMessage(messageDTO.getMessage());
        producerService.send(classifiedMessage);
    }
}
