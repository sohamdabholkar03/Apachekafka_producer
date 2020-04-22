package com.kafka.producer;

import com.kafka.producer.Producer.FixedRateProducer;
import com.kafka.producer.Producer.HelloKafkaProducer;
import com.kafka.producer.Producer.KafkaKeyProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class ProducerApplication implements CommandLineRunner {

//	@Autowired
//	private HelloKafkaProducer helloKafkaProducer;

//	@Autowired
//	private FixedRateProducer fixedRateProducer;

	@Autowired
	private KafkaKeyProducer kafkaKeyProducer;

	public static void main(String[] args) {
		System.out.println("producer");
		SpringApplication.run(ProducerApplication.class, args);
	}

	@Override
	public void run(String... args) {
		for(int i=0;i<30;i++)
		{
			String key= "key-"+(i%4);
			String Data="data" +i+"with key"+key;
			kafkaKeyProducer.send(key,Data);
		}

		//helloKafkaProducer.sendHello("Soham"+Math.random());
	}
}
