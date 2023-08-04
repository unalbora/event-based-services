package com.example.eventservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "message", "topic", "messageDate"})
public class ClassifiedMessage implements BaseMessage{

    private String id = UUID.randomUUID().toString();
    private String topic = "classified-topic";
    private LocalDateTime dateTime = LocalDateTime.now();

    private String message;

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getTopic() {
        return this.topic;
    }

    @Override
    public LocalDateTime getDateTime() {
        return this.dateTime;
    }
}
