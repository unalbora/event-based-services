package com.example.eventservice.model;

import java.time.LocalDateTime;

public interface BaseMessage {

    String getId();
    String getTopic();
    LocalDateTime getDateTime();
}
