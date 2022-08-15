package com.boot.kafka.wikimedia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    @KafkaListener(topics = "wikimedia_recentchange", groupId = "springBootKafka")
    public void consume(String eventMessage){
        LOGGER.info(String.format("event msg received -> %s", eventMessage));
    }
}
