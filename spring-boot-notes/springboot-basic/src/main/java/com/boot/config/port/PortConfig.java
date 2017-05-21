package com.boot.config.port;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
//@Configuration
public class PortConfig {

	/**
	 * tomcat 端口设置
	 * @return
	 */
	@Bean
	public EmbeddedServletContainerFactory getEmbeddedServletContainerFactory() {
		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
		factory.setPort(8010);
		return factory;
	}
	
	//JettyEmbeddedServletContainerFactory
	//UndertowEmbeddedServletContainerFactory
}
