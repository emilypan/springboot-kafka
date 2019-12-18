package com.example.demo.controller;

//import com.example.demo.kafka.KafkaSender;
//import com.example.demo.kafka.ProducerService;
import com.example.demo.kafka.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/")
@Slf4j
public class KafkaController {
    @Autowired
    private ProducerService producerService;

    @RequestMapping(value = "/produce", method = RequestMethod.POST)
    public String produce(@RequestParam("message") String message, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {

        this.producerService.sendMessage(message);

        return "ok";
    }

    @RequestMapping(value = "/produce/greeting", method = RequestMethod.POST)
    public String produceGreeting(@RequestParam("message") String message, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {

        this.producerService.sendMessageGreeting(new Greeting(message, message));

        return "ok";
    }
}

