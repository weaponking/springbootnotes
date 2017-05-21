package com.boot;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import lombok.extern.slf4j.Slf4j;

@WebListener
@Slf4j
public class ExtServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		log.info("contextInitialized servletContextEvent : "+servletContextEvent.toString());
	}

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		log.info("contextDestroyed servletContextEvent : "+servletContextEvent.toString());
	}

}
