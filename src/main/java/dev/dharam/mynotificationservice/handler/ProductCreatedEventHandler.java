package dev.dharam.mynotificationservice.handler;

import dev.dharam.kafkacore.ProductCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "product-created-topic-event")
public class ProductCreatedEventHandler {

      Logger logger = LoggerFactory.getLogger(this.getClass());
    @KafkaHandler
    public void handle(ProductCreatedEvent productCreatedEvent){
        logger.info("Received a new event "+productCreatedEvent.getTitle());
        System.out.println("Received a new event "+productCreatedEvent.getTitle());
    }
}
