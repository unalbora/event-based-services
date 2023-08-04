package com.example.auctionservice.controller;

import com.example.eventservice.model.ClassifiedMessage;
import com.example.auctionservice.model.MessageDTO;
import com.example.eventservice.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auction")
@RequiredArgsConstructor
public class AuctionController {

    private final ProducerService producerService;

    @PostMapping
    public void sendMessage(@RequestBody MessageDTO messageDTO) {
        ClassifiedMessage classifiedMessage = new ClassifiedMessage();
        classifiedMessage.setTopic("classified-topic");
        classifiedMessage.setMessage(messageDTO.getMessage());
        producerService.send(classifiedMessage);
    }
}
