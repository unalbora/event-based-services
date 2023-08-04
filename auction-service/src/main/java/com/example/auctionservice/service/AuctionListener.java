package com.example.auctionservice.service;

import com.example.eventservice.model.ClassifiedMessage;
import com.example.eventservice.service.ListenerService;
import org.springframework.stereotype.Service;

@Service
public class AuctionListener extends ListenerService {
    @Override
    public void handleClassified(ClassifiedMessage classifiedMessage) {
        String message = String.format("Message received.. Message: %s", classifiedMessage.getMessage());
        System.out.println(message);
    }
}
