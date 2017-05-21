package com.boot;

public class MvcCase {
/*
			=========================
			AUTO-CONFIGURATION REPORT
			=========================


			Positive matches:
			-----------------

			   DispatcherServletAutoConfiguration matched:
			      - @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
			      - @ConditionalOnWebApplication (required) found StandardServletEnvironment (OnWebApplicationCondition)

			   DispatcherServletAutoConfiguration.DispatcherServletConfiguration matched:
			      - @ConditionalOnClass found required class 'javax.servlet.ServletRegistration'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
			      - Default DispatcherServlet did not find dispatcher servlet beans (DispatcherServletAutoConfiguration.DefaultDispatcherServletCondition)

			   DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration matched:
			      - @ConditionalOnClass found required class 'javax.servlet.ServletRegistration'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
			      - DispatcherServlet Registration did not find servlet registration bean (DispatcherServletAutoConfiguration.DispatcherServletRegistrationCondition)

			   DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration#dispatcherServletRegistration matched:
			      - @ConditionalOnBean (names: dispatcherServlet; types: org.springframework.web.servlet.DispatcherServlet; SearchStrategy: all) found beans 'dispatcherServlet', 'dispatcherServlet' (OnBeanCondition)

			   EmbeddedServletContainerAutoConfiguration matched:
			      - @ConditionalOnWebApplication (required) found StandardServletEnvironment (OnWebApplicationCondition)

			   EmbeddedServletContainerAutoConfiguration.EmbeddedTomcat matched:
			      - @ConditionalOnClass found required classes 'javax.servlet.Servlet', 'org.apache.catalina.startup.Tomcat'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
			      - @ConditionalOnMissingBean (types: org.springframework.boot.context.embedded.EmbeddedServletContainerFactory; SearchStrategy: current) did not find any beans (OnBeanCondition)

			   ErrorMvcAutoConfiguration matched:
			      - @ConditionalOnClass found required classes 'javax.servlet.Servlet', 'org.springframework.web.servlet.DispatcherServlet'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
			      - @ConditionalOnWebApplication (required) found StandardServletEnvironment (OnWebApplicationCondition)

			   ErrorMvcAutoConfiguration#basicErrorController matched:
			      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.ErrorController; SearchStrategy: current) did not find any beans (OnBeanCondition)

			   ErrorMvcAutoConfiguration#errorAttributes matched:
			      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.ErrorAttributes; SearchStrategy: current) did not find any beans (OnBeanCondition)

			   ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration#conventionErrorViewResolver matched:
			      - @ConditionalOnBean (types: org.springframework.web.servlet.DispatcherServlet; SearchStrategy: all) found bean 'dispatcherServlet'; @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.DefaultErrorViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration matched:
			      - @ConditionalOnProperty (server.error.whitelabel.enabled) matched (OnPropertyCondition)
			      - ErrorTemplate Missing did not find error template view (ErrorMvcAutoConfiguration.ErrorTemplateMissingCondition)

			   ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration#beanNameViewResolver matched:
			      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.BeanNameViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration#defaultErrorView matched:
			      - @ConditionalOnMissingBean (names: error; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   GenericCacheConfiguration matched:
			      - Cache org.springframework.boot.autoconfigure.cache.GenericCacheConfiguration automatic cache type (CacheCondition)

			   HttpEncodingAutoConfiguration matched:
			      - @ConditionalOnClass found required class 'org.springframework.web.filter.CharacterEncodingFilter'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
			      - @ConditionalOnWebApplication (required) found StandardServletEnvironment (OnWebApplicationCondition)
			      - @ConditionalOnProperty (spring.http.encoding.enabled) matched (OnPropertyCondition)

			   HttpEncodingAutoConfiguration#characterEncodingFilter matched:
			      - @ConditionalOnMissingBean (types: org.springframework.web.filter.CharacterEncodingFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   HttpMessageConvertersAutoConfiguration matched:
			      - @ConditionalOnClass found required class 'org.springframework.http.converter.HttpMessageConverter'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)

			   HttpMessageConvertersAutoConfiguration#messageConverters matched:
			      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.HttpMessageConverters; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration matched:
			      - @ConditionalOnClass found required class 'org.springframework.http.converter.StringHttpMessageConverter'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)

			   HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration#stringHttpMessageConverter matched:
			      - @ConditionalOnMissingBean (types: org.springframework.http.converter.StringHttpMessageConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   JacksonAutoConfiguration matched:
			      - @ConditionalOnClass found required class 'com.fasterxml.jackson.databind.ObjectMapper'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)

			   JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration matched:
			      - @ConditionalOnClass found required classes 'com.fasterxml.jackson.databind.ObjectMapper', 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)

			   JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration matched:
			      - @ConditionalOnClass found required classes 'com.fasterxml.jackson.databind.ObjectMapper', 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)

			   JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration#jacksonObjectMapperBuilder matched:
			      - @ConditionalOnMissingBean (types: org.springframework.http.converter.json.Jackson2ObjectMapperBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   JacksonAutoConfiguration.JacksonObjectMapperConfiguration matched:
			      - @ConditionalOnClass found required classes 'com.fasterxml.jackson.databind.ObjectMapper', 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)

			   JacksonAutoConfiguration.JacksonObjectMapperConfiguration#jacksonObjectMapper matched:
			      - @ConditionalOnMissingBean (types: com.fasterxml.jackson.databind.ObjectMapper; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration matched:
			      - @ConditionalOnClass found required class 'com.fasterxml.jackson.databind.ObjectMapper'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
			      - @ConditionalOnProperty (spring.http.converters.preferred-json-mapper=jackson) matched (OnPropertyCondition)
			      - @ConditionalOnBean (types: com.fasterxml.jackson.databind.ObjectMapper; SearchStrategy: all) found bean 'jacksonObjectMapper' (OnBeanCondition)

			   JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration#mappingJackson2HttpMessageConverter matched:
			      - @ConditionalOnMissingBean (types: org.springframework.http.converter.json.MappingJackson2HttpMessageConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   JmxAutoConfiguration matched:
			      - @ConditionalOnClass found required class 'org.springframework.jmx.export.MBeanExporter'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
			      - @ConditionalOnProperty (spring.jmx.enabled=true) matched (OnPropertyCondition)

			   JmxAutoConfiguration#mbeanExporter matched:
			      - @ConditionalOnMissingBean (types: org.springframework.jmx.export.MBeanExporter; SearchStrategy: current) did not find any beans (OnBeanCondition)

			   JmxAutoConfiguration#mbeanServer matched:
			      - @ConditionalOnMissingBean (types: javax.management.MBeanServer; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   JmxAutoConfiguration#objectNamingStrategy matched:
			      - @ConditionalOnMissingBean (types: org.springframework.jmx.export.naming.ObjectNamingStrategy; SearchStrategy: current) did not find any beans (OnBeanCondition)

			   LocalDevToolsAutoConfiguration matched:
			      - Initialized Restarter Condition available and initialized (OnInitializedRestarterCondition)

			   LocalDevToolsAutoConfiguration.LiveReloadConfiguration matched:
			      - @ConditionalOnProperty (spring.devtools.livereload.enabled) matched (OnPropertyCondition)

			   LocalDevToolsAutoConfiguration.LiveReloadConfiguration#liveReloadServer matched:
			      - @ConditionalOnMissingBean (types: org.springframework.boot.devtools.livereload.LiveReloadServer; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   LocalDevToolsAutoConfiguration.RestartConfiguration matched:
			      - @ConditionalOnProperty (spring.devtools.restart.enabled) matched (OnPropertyCondition)

			   LocalDevToolsAutoConfiguration.RestartConfiguration#classPathFileSystemWatcher matched:
			      - @ConditionalOnMissingBean (types: org.springframework.boot.devtools.classpath.ClassPathFileSystemWatcher; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   LocalDevToolsAutoConfiguration.RestartConfiguration#classPathRestartStrategy matched:
			      - @ConditionalOnMissingBean (types: org.springframework.boot.devtools.classpath.ClassPathRestartStrategy; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   MultipartAutoConfiguration matched:
			      - @ConditionalOnClass found required classes 'javax.servlet.Servlet', 'org.springframework.web.multipart.support.StandardServletMultipartResolver', 'javax.servlet.MultipartConfigElement'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
			      - @ConditionalOnProperty (spring.http.multipart.enabled) matched (OnPropertyCondition)

			   MultipartAutoConfiguration#multipartConfigElement matched:
			      - @ConditionalOnMissingBean (types: javax.servlet.MultipartConfigElement; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   MultipartAutoConfiguration#multipartResolver matched:
			      - @ConditionalOnMissingBean (types: org.springframework.web.multipart.MultipartResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   NoOpCacheConfiguration matched:
			      - Cache org.springframework.boot.autoconfigure.cache.NoOpCacheConfiguration automatic cache type (CacheCondition)

			   PropertyPlaceholderAutoConfiguration#propertySourcesPlaceholderConfigurer matched:
			      - @ConditionalOnMissingBean (types: org.springframework.context.support.PropertySourcesPlaceholderConfigurer; SearchStrategy: current) did not find any beans (OnBeanCondition)

			   RedisCacheConfiguration matched:
			      - Cache org.springframework.boot.autoconfigure.cache.RedisCacheConfiguration automatic cache type (CacheCondition)

			   ServerPropertiesAutoConfiguration matched:
			      - @ConditionalOnWebApplication (required) found StandardServletEnvironment (OnWebApplicationCondition)

			   ServerPropertiesAutoConfiguration#serverProperties matched:
			      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.ServerProperties; SearchStrategy: current) did not find any beans (OnBeanCondition)

			   SimpleCacheConfiguration matched:
			      - Cache org.springframework.boot.autoconfigure.cache.SimpleCacheConfiguration automatic cache type (CacheCondition)

			   SpringApplicationAdminJmxAutoConfiguration matched:
			      - @ConditionalOnProperty (spring.application.admin.enabled=true) matched (OnPropertyCondition)

			   SpringApplicationAdminJmxAutoConfiguration#springApplicationAdminRegistrar matched:
			      - @ConditionalOnMissingBean (types: org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   ValidationAutoConfiguration matched:
			      - @ConditionalOnClass found required class 'javax.validation.executable.ExecutableValidator'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
			      - @ConditionalOnResource found location classpath:META-INF/services/javax.validation.spi.ValidationProvider (OnResourceCondition)

			   ValidationAutoConfiguration#jsr303Validator matched:
			      - @ConditionalOnMissingBean (types: javax.validation.Validator; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   ValidationAutoConfiguration#methodValidationPostProcessor matched:
			      - @ConditionalOnMissingBean (types: org.springframework.validation.beanvalidation.MethodValidationPostProcessor; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   WebClientAutoConfiguration.RestTemplateConfiguration matched:
			      - @ConditionalOnClass found required class 'org.springframework.web.client.RestTemplate'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)

			   WebClientAutoConfiguration.RestTemplateConfiguration#restTemplateBuilder matched:
			      - @ConditionalOnMissingBean (types: org.springframework.boot.web.client.RestTemplateBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   WebMvcAutoConfiguration matched:
			      - @ConditionalOnClass found required classes 'javax.servlet.Servlet', 'org.springframework.web.servlet.DispatcherServlet', 'org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
			      - @ConditionalOnWebApplication (required) found StandardServletEnvironment (OnWebApplicationCondition)
			      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   WebMvcAutoConfiguration#hiddenHttpMethodFilter matched:
			      - @ConditionalOnMissingBean (types: org.springframework.web.filter.HiddenHttpMethodFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   WebMvcAutoConfiguration#httpPutFormContentFilter matched:
			      - @ConditionalOnProperty (spring.mvc.formcontent.putfilter.enabled) matched (OnPropertyCondition)
			      - @ConditionalOnMissingBean (types: org.springframework.web.filter.HttpPutFormContentFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#defaultViewResolver matched:
			      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.InternalResourceViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#requestContextFilter matched:
			      - @ConditionalOnMissingBean (types: org.springframework.web.context.request.RequestContextListener,org.springframework.web.filter.RequestContextFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#viewResolver matched:
			      - @ConditionalOnBean (types: org.springframework.web.servlet.ViewResolver; SearchStrategy: all) found beans 'defaultViewResolver', 'beanNameViewResolver', 'mvcViewResolver'; @ConditionalOnMissingBean (names: viewResolver; types: org.springframework.web.servlet.view.ContentNegotiatingViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter.FaviconConfiguration matched:
			      - @ConditionalOnProperty (spring.mvc.favicon.enabled) matched (OnPropertyCondition)

			   WebSocketAutoConfiguration matched:
			      - @ConditionalOnClass found required classes 'javax.servlet.Servlet', 'javax.websocket.server.ServerContainer'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
			      - @ConditionalOnWebApplication (required) found StandardServletEnvironment (OnWebApplicationCondition)

			   WebSocketAutoConfiguration.TomcatWebSocketConfiguration matched:
			      - @ConditionalOnClass found required classes 'org.apache.catalina.startup.Tomcat', 'org.apache.tomcat.websocket.server.WsSci'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)

			   WebSocketAutoConfiguration.TomcatWebSocketConfiguration#websocketContainerCustomizer matched:
			      - @ConditionalOnJava (1.7 or newer) found 1.8 (OnJavaCondition)
			      - @ConditionalOnMissingBean (names: websocketContainerCustomizer; SearchStrategy: all) did not find any beans (OnBeanCondition)


			Negative matches:
			-----------------

			   ActiveMQAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'javax.jms.ConnectionFactory', 'org.apache.activemq.ActiveMQConnectionFactory' (OnClassCondition)

			   AopAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.aspectj.lang.annotation.Aspect', 'org.aspectj.lang.reflect.Advice' (OnClassCondition)

			   ArtemisAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'javax.jms.ConnectionFactory', 'org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory' (OnClassCondition)

			   BatchAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.batch.core.launch.JobLauncher', 'org.springframework.jdbc.core.JdbcOperations' (OnClassCondition)

			   CacheAutoConfiguration:
			      Did not match:
			         - @ConditionalOnBean (types: org.springframework.cache.interceptor.CacheAspectSupport; SearchStrategy: all) did not find any beans (OnBeanCondition)
			      Matched:
			         - @ConditionalOnClass found required class 'org.springframework.cache.CacheManager'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)

			   CacheAutoConfiguration.CacheManagerJpaDependencyConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean' (OnClassCondition)
			         - Ancestor org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration did not match (ConditionEvaluationReport.AncestorsMatchedCondition)

			   CaffeineCacheConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'com.github.benmanes.caffeine.cache.Caffeine', 'org.springframework.cache.caffeine.CaffeineCacheManager' (OnClassCondition)

			   CassandraAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'com.datastax.driver.core.Cluster' (OnClassCondition)

			   CassandraDataAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'com.datastax.driver.core.Cluster', 'org.springframework.data.cassandra.core.CassandraAdminOperations' (OnClassCondition)

			   CassandraRepositoriesAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'com.datastax.driver.core.Session', 'org.springframework.data.cassandra.repository.CassandraRepository' (OnClassCondition)

			   CloudAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.cloud.config.java.CloudScanConfiguration' (OnClassCondition)

			   CouchbaseAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'com.couchbase.client.java.CouchbaseBucket', 'com.couchbase.client.java.Cluster' (OnClassCondition)

			   CouchbaseCacheConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'com.couchbase.client.java.Bucket', 'com.couchbase.client.spring.cache.CouchbaseCacheManager' (OnClassCondition)

			   CouchbaseDataAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'com.couchbase.client.java.Bucket', 'org.springframework.data.couchbase.repository.CouchbaseRepository' (OnClassCondition)

			   CouchbaseRepositoriesAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'com.couchbase.client.java.Bucket', 'org.springframework.data.couchbase.repository.CouchbaseRepository' (OnClassCondition)

			   DataSourceAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType' (OnClassCondition)

			   DataSourceTransactionManagerAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.jdbc.core.JdbcTemplate', 'org.springframework.transaction.PlatformTransactionManager' (OnClassCondition)

			   DevToolsDataSourceAutoConfiguration:
			      Did not match:
			         - DevTools DataSource Condition did not find a single DataSource bean (DevToolsDataSourceAutoConfiguration.DevToolsDataSourceCondition)

			   DevToolsDataSourceAutoConfiguration.DatabaseShutdownExecutorJpaDependencyConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean' (OnClassCondition)
			         - Ancestor org.springframework.boot.devtools.autoconfigure.DevToolsDataSourceAutoConfiguration did not match (ConditionEvaluationReport.AncestorsMatchedCondition)

			   DeviceDelegatingViewResolverAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.mobile.device.view.LiteDeviceDelegatingViewResolver' (OnClassCondition)

			   DeviceResolverAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.mobile.device.DeviceResolverHandlerInterceptor', 'org.springframework.mobile.device.DeviceHandlerMethodArgumentResolver' (OnClassCondition)

			   DispatcherServletAutoConfiguration.DispatcherServletConfiguration#multipartResolver:
			      Did not match:
			         - @ConditionalOnBean (types: org.springframework.web.multipart.MultipartResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

			   EhCacheCacheConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'net.sf.ehcache.Cache', 'org.springframework.cache.ehcache.EhCacheCacheManager' (OnClassCondition)

			   ElasticsearchAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.elasticsearch.client.Client', 'org.springframework.data.elasticsearch.client.TransportClientFactoryBean', 'org.springframework.data.elasticsearch.client.NodeClientFactoryBean' (OnClassCondition)

			   ElasticsearchDataAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.elasticsearch.client.Client', 'org.springframework.data.elasticsearch.core.ElasticsearchTemplate' (OnClassCondition)

			   ElasticsearchRepositoriesAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.elasticsearch.client.Client', 'org.springframework.data.elasticsearch.repository.ElasticsearchRepository' (OnClassCondition)

			   EmbeddedLdapAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'com.unboundid.ldap.listener.InMemoryDirectoryServer' (OnClassCondition)

			   EmbeddedMongoAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'com.mongodb.Mongo', 'de.flapdoodle.embed.mongo.MongodStarter' (OnClassCondition)

			   EmbeddedServletContainerAutoConfiguration.EmbeddedJetty:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.eclipse.jetty.server.Server', 'org.eclipse.jetty.util.Loader', 'org.eclipse.jetty.webapp.WebAppContext' (OnClassCondition)

			   EmbeddedServletContainerAutoConfiguration.EmbeddedUndertow:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'io.undertow.Undertow', 'org.xnio.SslClientAuthMode' (OnClassCondition)

			   FacebookAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.social.config.annotation.SocialConfigurerAdapter', 'org.springframework.social.facebook.connect.FacebookConnectionFactory' (OnClassCondition)

			   FallbackWebSecurityAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.security.config.annotation.web.configuration.EnableWebSecurity' (OnClassCondition)

			   FlywayAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.flywaydb.core.Flyway' (OnClassCondition)

			   FreeMarkerAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'freemarker.template.Configuration', 'org.springframework.ui.freemarker.FreeMarkerConfigurationFactory' (OnClassCondition)

			   GroovyTemplateAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'groovy.text.markup.MarkupTemplateEngine' (OnClassCondition)

			   GsonAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'com.google.gson.Gson' (OnClassCondition)

			   GsonHttpMessageConvertersConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'com.google.gson.Gson' (OnClassCondition)

			   GuavaCacheConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.cache.guava.GuavaCacheManager' (OnClassCondition)

			   H2ConsoleAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.h2.server.web.WebServlet' (OnClassCondition)

			   HazelcastAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance' (OnClassCondition)

			   HazelcastCacheConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'com.hazelcast.core.HazelcastInstance', 'com.hazelcast.spring.cache.HazelcastCacheManager' (OnClassCondition)

			   HazelcastJpaDependencyAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'com.hazelcast.core.HazelcastInstance', 'org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean' (OnClassCondition)

			   HibernateJpaAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean', 'org.springframework.transaction.annotation.EnableTransactionManagement', 'javax.persistence.EntityManager' (OnClassCondition)

			   HypermediaAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.hateoas.Resource', 'org.springframework.plugin.core.Plugin' (OnClassCondition)

			   InfinispanCacheConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.infinispan.spring.provider.SpringEmbeddedCacheManager' (OnClassCondition)

			   IntegrationAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.integration.config.EnableIntegration' (OnClassCondition)

			   JCacheCacheConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'javax.cache.Caching', 'org.springframework.cache.jcache.JCacheCacheManager' (OnClassCondition)

			   JacksonAutoConfiguration.JodaDateTimeJacksonConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.joda.time.DateTime', 'com.fasterxml.jackson.datatype.joda.ser.DateTimeSerializer', 'com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat' (OnClassCondition)

			   JacksonAutoConfiguration.ParameterNamesModuleConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'com.fasterxml.jackson.module.paramnames.ParameterNamesModule' (OnClassCondition)

			   JacksonHttpMessageConvertersConfiguration.MappingJackson2XmlHttpMessageConverterConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'com.fasterxml.jackson.dataformat.xml.XmlMapper' (OnClassCondition)

			   JdbcTemplateAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.jdbc.core.JdbcTemplate' (OnClassCondition)

			   JerseyAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.glassfish.jersey.server.spring.SpringComponentProvider' (OnClassCondition)

			   JestAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'io.searchbox.client.JestClient' (OnClassCondition)

			   JmsAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'javax.jms.Message', 'org.springframework.jms.core.JmsTemplate' (OnClassCondition)

			   JndiConnectionFactoryAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.jms.core.JmsTemplate' (OnClassCondition)

			   JndiDataSourceAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType' (OnClassCondition)

			   JooqAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.jooq.DSLContext' (OnClassCondition)

			   JpaRepositoriesAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.data.jpa.repository.JpaRepository' (OnClassCondition)

			   JtaAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'javax.transaction.Transaction' (OnClassCondition)

			   KafkaAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.kafka.core.KafkaTemplate' (OnClassCondition)

			   LdapAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.ldap.core.ContextSource' (OnClassCondition)

			   LdapDataAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.data.ldap.repository.LdapRepository' (OnClassCondition)

			   LdapRepositoriesAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.data.ldap.repository.LdapRepository' (OnClassCondition)

			   LinkedInAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.social.config.annotation.SocialConfigurerAdapter', 'org.springframework.social.linkedin.connect.LinkedInConnectionFactory' (OnClassCondition)

			   LiquibaseAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'liquibase.integration.spring.SpringLiquibase' (OnClassCondition)

			   MailSenderAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'javax.mail.internet.MimeMessage' (OnClassCondition)

			   MailSenderValidatorAutoConfiguration:
			      Did not match:
			         - @ConditionalOnProperty (spring.mail.test-connection) did not find property 'test-connection' (OnPropertyCondition)

			   MessageSourceAutoConfiguration:
			      Did not match:
			         - ResourceBundle did not find bundle with basename messages (MessageSourceAutoConfiguration.ResourceBundleCondition)

			   MongoAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'com.mongodb.MongoClient' (OnClassCondition)

			   MongoDataAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'com.mongodb.Mongo', 'org.springframework.data.mongodb.core.MongoTemplate' (OnClassCondition)

			   MongoRepositoriesAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'com.mongodb.Mongo', 'org.springframework.data.mongodb.repository.MongoRepository' (OnClassCondition)

			   MustacheAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'com.samskivert.mustache.Mustache' (OnClassCondition)

			   Neo4jDataAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.neo4j.ogm.session.SessionFactory', 'org.springframework.transaction.PlatformTransactionManager' (OnClassCondition)

			   Neo4jRepositoriesAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.neo4j.ogm.session.Neo4jSession', 'org.springframework.data.neo4j.repository.GraphRepository' (OnClassCondition)

			   OAuth2AutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.security.oauth2.common.OAuth2AccessToken' (OnClassCondition)

			   PersistenceExceptionTranslationAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor' (OnClassCondition)

			   ProjectInfoAutoConfiguration#buildProperties:
			      Did not match:
			         - @ConditionalOnResource did not find resource '${spring.info.build.location:classpath:META-INF/build-info.properties}' (OnResourceCondition)

			   ProjectInfoAutoConfiguration#gitProperties:
			      Did not match:
			         - GitResource did not find git info at classpath:git.properties (ProjectInfoAutoConfiguration.GitResourceAvailableCondition)

			   RabbitAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.amqp.rabbit.core.RabbitTemplate', 'com.rabbitmq.client.Channel' (OnClassCondition)

			   ReactorAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'reactor.spring.context.config.EnableReactor', 'reactor.Environment' (OnClassCondition)

			   RedisAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.data.redis.connection.jedis.JedisConnection', 'org.springframework.data.redis.core.RedisOperations', 'redis.clients.jedis.Jedis' (OnClassCondition)

			   RedisRepositoriesAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'redis.clients.jedis.Jedis', 'org.springframework.data.redis.repository.configuration.EnableRedisRepositories' (OnClassCondition)

			   RemoteDevToolsAutoConfiguration:
			      Did not match:
			         - @ConditionalOnProperty (spring.devtools.remote.secret) did not find property 'secret' (OnPropertyCondition)
			      Matched:
			         - @ConditionalOnClass found required classes 'javax.servlet.Filter', 'org.springframework.http.server.ServerHttpRequest'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)

			   RepositoryRestMvcAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration' (OnClassCondition)

			   SecurityAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.security.authentication.AuthenticationManager', 'org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter' (OnClassCondition)

			   SecurityFilterAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer', 'org.springframework.security.config.http.SessionCreationPolicy' (OnClassCondition)

			   SendGridAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'com.sendgrid.SendGrid' (OnClassCondition)

			   SessionAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.session.Session' (OnClassCondition)

			   SitePreferenceAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.mobile.device.site.SitePreferenceHandlerInterceptor', 'org.springframework.mobile.device.site.SitePreferenceHandlerMethodArgumentResolver' (OnClassCondition)

			   SocialWebAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.social.connect.web.ConnectController', 'org.springframework.social.config.annotation.SocialConfigurerAdapter' (OnClassCondition)

			   SolrAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.apache.solr.client.solrj.impl.HttpSolrClient', 'org.apache.solr.client.solrj.impl.CloudSolrClient' (OnClassCondition)

			   SolrRepositoriesAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.apache.solr.client.solrj.SolrClient', 'org.springframework.data.solr.repository.SolrRepository' (OnClassCondition)

			   SpringDataWebAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.data.web.PageableHandlerMethodArgumentResolver' (OnClassCondition)

			   ThymeleafAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.thymeleaf.spring4.SpringTemplateEngine' (OnClassCondition)

			   TransactionAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.transaction.PlatformTransactionManager' (OnClassCondition)

			   TwitterAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'org.springframework.social.config.annotation.SocialConfigurerAdapter', 'org.springframework.social.twitter.connect.TwitterConnectionFactory' (OnClassCondition)

			   WebMvcAutoConfiguration.ResourceChainCustomizerConfiguration:
			      Did not match:
			         - @ConditionalOnEnabledResourceChain did not find class org.webjars.WebJarAssetLocator (OnEnabledResourceChainCondition)

			   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#beanNameViewResolver:
			      Did not match:
			         - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.BeanNameViewResolver; SearchStrategy: all) found bean 'beanNameViewResolver' (OnBeanCondition)

			   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#dateFormatter:
			      Did not match:
			         - @ConditionalOnProperty (spring.mvc.date-format) did not find property 'date-format' (OnPropertyCondition)

			   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#localeResolver:
			      Did not match:
			         - @ConditionalOnProperty (spring.mvc.locale) did not find property 'locale' (OnPropertyCondition)

			   WebServicesAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.ws.transport.http.MessageDispatcherServlet' (OnClassCondition)

			   WebSocketAutoConfiguration.JettyWebSocketConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.eclipse.jetty.websocket.jsr356.server.deploy.WebSocketServerContainerInitializer' (OnClassCondition)

			   WebSocketAutoConfiguration.UndertowWebSocketConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'io.undertow.websockets.jsr.Bootstrap' (OnClassCondition)

			   WebSocketMessagingAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required class 'org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer' (OnClassCondition)

			   XADataSourceAutoConfiguration:
			      Did not match:
			         - @ConditionalOnClass did not find required classes 'javax.transaction.TransactionManager', 'org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType' (OnClassCondition)


			Exclusions:
			-----------

			    None


			Unconditional classes:
			----------------------

			    org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration

			    org.springframework.boot.autoconfigure.web.WebClientAutoConfiguration

			    org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration

			    org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration
*/
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

