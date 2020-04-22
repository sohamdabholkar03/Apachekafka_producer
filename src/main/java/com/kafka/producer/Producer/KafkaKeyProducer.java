package com.kafka.producer.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaKeyProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void send(String key,String Data)
    {
        kafkaTemplate.send("t_multi_partitions",key,Data);
    }
}
