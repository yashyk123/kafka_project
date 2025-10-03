package com.producerDemo.producer.producer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class KafkaProducerStreams {
    @Bean
    public Supplier<RiderLocation> sendRiderLocation(){
        return ()-> {
            RiderLocation location = new RiderLocation("riderYk123",65,88);
            System.out.println("Sending: " + location.getRiderId());
            return location;
        };
    }
}
