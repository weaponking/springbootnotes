package com.boot.config;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class ExtApplicationListener implements ApplicationListener<ApplicationEvent> {
	
	public void onApplicationEvent(ApplicationEvent event) {
		log.info("--------"+event.toString()+"---------");
	}
	
}
/**
 * If you want those listeners to be registered automatically regardless of the way the application is 
 * created you can add a META-INF/spring.factories file to your project and reference your listener(s) 
 * using the org.springframework.context.ApplicationListener key.
 * 
 * 	org.springframework.context.ApplicationListener=com.sample.config.ExtApplicationListener
 */

//An ApplicationStartingEvent 
//	is sent at the start of a run, but before any processing except the registration of listeners and initializers.

//An ApplicationEnvironmentPreparedEvent is sent when the Environment to be used in the context is known, 
//	but before the context is created.

//An ApplicationPreparedEvent is sent just before the refresh is started, but after bean definitions have been loaded.

//An ApplicationReadyEvent is sent after the refresh and any related 
//	callbacks have been processed to indicate the application is ready to service requests.

//An ApplicationFailedEvent is sent if there is an exception on startup.