package com.example.demo.kafka;

import com.example.demo.controller.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerService {

    @KafkaListener(topics = "kafkatesting-a", groupId = "group-id")
    public void consumeMessage(String message) {
        System.out.println("Received Messasge in group foo: " + message);
        log.debug("Consumed topic -> {}", message);
        log.debug("Consumed topic -> {}", message);
    }

    @KafkaListener(topics = "kafkagreeting", groupId = "group-id", containerFactory = "greetingKafkaListenerContainerFactory")
    public void consumeMessageGreeting(Greeting greeting) {
        log.debug("consumeMessageGreeting Consumed topic -> {}", greeting.toString());
    }
}
