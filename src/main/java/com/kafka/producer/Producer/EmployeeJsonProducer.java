package com.kafka.producer.Producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kafka.producer.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeJsonProducer {

    @Autowired
    private KafkaTemplate<String, Employee> kafkaTemplate;

    public void sendmessage(Employee employee) throws JsonProcessingException {
        kafkaTemplate.send("t_employee", employee);
    }
}
