package com.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.boot.interceptor.UrlInterceptor;

@Configuration
public class ExtWebMvcConfigurer extends WebMvcConfigurerAdapter {

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new UrlInterceptor()).addPathPatterns("/*");
	}
	
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		//@EnableAsync
		//org.springframework.scheduling.annotation.AsyncConfigurationSelector
	}
}

//spring.mvc.async.request-timeout= # Amount of time (in milliseconds) before asynchronous request handling times out.
//spring.mvc.date-format= # Date format to use. For instance `dd/MM/yyyy`.
//spring.mvc.dispatch-trace-request=false # Dispatch TRACE requests to the FrameworkServlet doService method.
//spring.mvc.dispatch-options-request=true # Dispatch OPTIONS requests to the FrameworkServlet doService method.
//spring.mvc.favicon.enabled=true # Enable resolution of favicon.ico.
//spring.mvc.formcontent.putfilter.enabled=true # Enable Spring's HttpPutFormContentFilter.
//spring.mvc.ignore-default-model-on-redirect=true # If the content of the "default" model should be ignored during redirect scenarios.
//spring.mvc.locale= # Locale to use. By default, this locale is overridden by the "Accept-Language" header.
//spring.mvc.locale-resolver=accept-header # Define how the locale should be resolved.
//spring.mvc.log-resolved-exception=false # Enable warn logging of exceptions resolved by a "HandlerExceptionResolver".
//spring.mvc.media-types.*= # Maps file extensions to media types for content negotiation.
//spring.mvc.message-codes-resolver-format= # Formatting strategy for message codes. For instance `PREFIX_ERROR_CODE`.
//spring.mvc.servlet.load-on-startup=-1 # Load on startup priority of the Spring Web Services servlet.
//spring.mvc.static-path-pattern=/** # Path pattern used for static resources.
//spring.mvc.throw-exception-if-no-handler-found=false # If a "NoHandlerFoundException" should be thrown if no Handler was found to process a request.
//spring.mvc.view.prefix= # Spring MVC view prefix.
//spring.mvc.view.suffix= # Spring MVC view suffix.
