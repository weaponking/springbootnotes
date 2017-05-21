package com.boot.durid;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
@EnableConfigurationProperties(DuridProperties.class)
public class DuridConfig {

	@Autowired
	private DuridProperties duridProperties;

	@Bean
	public DataSource getDataSource() {

		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(duridProperties.getDriver());
		dataSource.setUrl(duridProperties.getUrl());
		dataSource.setUsername(duridProperties.getUsername());
		dataSource.setPassword(duridProperties.getPassword());
		dataSource.setMaxActive(duridProperties.getMaxActive());
		dataSource.setInitialSize(duridProperties.getInitialSize());
		dataSource.setMaxWait(duridProperties.getMaxWait());
		dataSource.setMinIdle(duridProperties.getMinIdle());
		dataSource.setRemoveAbandoned(duridProperties.isRemoveAbandoned());
		dataSource.setRemoveAbandonedTimeout(duridProperties.getRemoveAbandonedTimeout());
		dataSource.setValidationQuery(duridProperties.getValidationQuery());
		dataSource.setTestWhileIdle(duridProperties.isTestWhileIdle());
		dataSource.setTestOnBorrow(duridProperties.isTestOnBorrow());
		dataSource.setTestOnReturn(duridProperties.isTestOnReturn());
		dataSource.setPoolPreparedStatements(duridProperties.isPoolPreparedStatements());
		dataSource.setMaxPoolPreparedStatementPerConnectionSize(
				duridProperties.getMaxPoolPreparedStatementPerConnectionSize());
		dataSource.setConnectionProperties(duridProperties.getConnectionProperties());

		return dataSource;
	}

	@Value("${druid.monitor.urlMapping}")
	private String urlMapping;
	@Value("${druid.monitor.allowIp}")
	private String allowIp;
	@Value("${druid.monitor.userName}")
	private String monitorUserName;
	@Value("${druid.monitor.password}")
	private String monitorPassword;
	@Value("${druid.monitor.UrlPatterns}")
	private String urlPatterns;
	@Value("${druid.monitor.exclusions}")
	private String exclusions;

	@Bean
	public ServletRegistrationBean druidServlet() {
		ServletRegistrationBean servlet = new ServletRegistrationBean();
		servlet.setServlet(new StatViewServlet());
		servlet.addUrlMappings(urlMapping);
		servlet.addInitParameter("allow", allowIp);
		servlet.addInitParameter("loginUsername", monitorUserName);
		servlet.addInitParameter("loginPassword", monitorPassword);
		return servlet;
	}

	@Bean
	public FilterRegistrationBean druidFilter() {
		FilterRegistrationBean filter = new FilterRegistrationBean();
		filter.setFilter(new WebStatFilter());
		filter.addUrlPatterns(urlPatterns);
		filter.addInitParameter("exclusions", exclusions);
		return filter;
	}
	
	//http://localhost:8080/druid/index.html
}
