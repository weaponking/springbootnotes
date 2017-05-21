package com.boot.config;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExtApplicationListener implements ApplicationListener<ApplicationEvent> {
	
	public void onApplicationEvent(ApplicationEvent event) {
		log.info(event.toString());
	}

}
