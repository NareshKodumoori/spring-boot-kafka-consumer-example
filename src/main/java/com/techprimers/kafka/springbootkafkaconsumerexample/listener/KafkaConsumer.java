package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import com.techprimers.kafka.springbootkafkaconsumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="mytest", groupId ="group_id")
    public void consumeMessage(String message){
        System.out.println("Consumed Message : " + message);
    }

    @KafkaListener(topics="mytest_json", groupId ="group_json", containerFactory = "userKafkaListenerFactory")
    public void consumeUser(User userMessage){
        System.out.println("Consumed User Message : " + userMessage);
    }
}
