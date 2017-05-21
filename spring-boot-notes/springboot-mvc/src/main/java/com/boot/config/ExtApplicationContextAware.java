package com.boot.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
@Lazy(false)
public class ExtApplicationContextAware implements ApplicationContextAware, DisposableBean {

	private static ApplicationContext APPLICATIONCONTEXT;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		APPLICATIONCONTEXT = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return APPLICATIONCONTEXT;
	}

	public void destroy() throws Exception {
		ExtApplicationContextAware.APPLICATIONCONTEXT = null;
	}

}

