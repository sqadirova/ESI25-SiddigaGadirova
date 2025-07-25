package com.esi.studentservice.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    NewTopic LeaveTopicCreation() {
        return TopicBuilder.name("LeaveRequestCreatedTopic")
                .build();
    }

    @Bean
    NewTopic LeaveTopicFinalized() {
        return TopicBuilder.name("LeaveRequestFinalizedTopic")
                .build();
    }
}
