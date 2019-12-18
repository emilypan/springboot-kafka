package com.example.demo.kafka;

import com.example.demo.controller.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProducerService {

    @Value("${spring.kafka.topic.name}")
    public String topic;
    @Value("${spring.kafka.topic.greeting}")
    public String topicGreeting;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, Greeting> greetingkafkaTemplate;

    public void sendMessage(String message) {
        log.debug("sendMessage: ", message);
        this.kafkaTemplate.send(topic, message);
    }

    public void sendMessageGreeting(Greeting greeting) {
        log.debug("sendMessageGreeting: ", greeting.toString());
        this.greetingkafkaTemplate.send(topicGreeting, greeting);
    }}
