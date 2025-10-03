package com.producerDemo.producer.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic createMyTopic()
    {
        return new NewTopic("my-new-Topic-2",3,(short) 1);
    }
}
