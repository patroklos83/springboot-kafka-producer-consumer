package com.patroclos;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyTopicConsumer {

    private final List<String> messages = new ArrayList<>();

    @KafkaListener(topics = "myTopic", groupId = "kafka-sample")
    public void listen(String message) {
        synchronized (messages) {
        	System.out.println("Received message");
            messages.add(message);
        }
    }

    public List<String> getMessages() {
        return messages;
    }

}