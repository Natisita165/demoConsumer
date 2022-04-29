package com.example.demoConsumer.demoConsumer;

import DTO.MessageDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class consumerListener {

    @RabbitListener(queues = RabbitMqConfig.QUEUE)
    public void listener(MessageDto messageDto){
        System.out.println("-----------");
        System.out.println(messageDto);
        System.out.println("-----------");
    }
}
