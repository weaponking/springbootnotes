package com.boot.config;

import javax.jms.Queue;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

@Configuration
@EnableJms
public class MqConfig {

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("text.queue");
	}
	
	@Bean
	public Queue objQueue() {
		return new ActiveMQQueue("obj.queue");
	}
}
