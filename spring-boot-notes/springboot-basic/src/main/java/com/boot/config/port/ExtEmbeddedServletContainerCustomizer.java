package com.boot.config.port;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Configuration;
@Configuration 
public class ExtEmbeddedServletContainerCustomizer implements EmbeddedServletContainerCustomizer {

	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8085);
	}

}
/**
 *修改server运行端口
 *	1.application.properties
 * 		server.port=9080
 *  2.implements EmbeddedServletContainerCustomizer
 *  
 *  3.设置不同容器的EmbeddedServletContainerFactory
*/