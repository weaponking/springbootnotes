package com.boot;
import javax.annotation.PreDestroy;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import lombok.extern.slf4j.Slf4j;
@SpringBootApplication
@Slf4j
public class BasicApplication {

	public static void main(String[] args) {
		
//		启动方式一
//		System.setProperty("spring.devtools.restart.enabled", "true");//设置自动启动
//		SpringApplication.run(BasicApplication.class, args);
//		addListeners 
//		SpringApplication.addListeners(new ExtApplicationListener()​);
		//启动方式二
		new SpringApplicationBuilder()
//			.registerShutdownHook(false)
        	.sources(BasicApplication.class)
//        		.banner(new Banner() {
//					public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
//						
//					}
//        		})
        		//addListeners
//        		.listeners(new ExtApplicationListener())
        			.run(args);
	}
	
	@PreDestroy
	public void destroy() {
		log.info("destroy");
	}

}
/*@SpringBootApplication
	same as 
		@Configuration 
		@EnableAutoConfiguration
		@ComponentScan {@Component, @Service, @Repository, @Controller}*/

/*
 * src/main/resources/META-INF文件夹新建spring.factories
 * 添加org.springframework.context.ApplicationListener=com.boot.config.ExtApplicationListener
 */




