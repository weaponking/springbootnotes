package com.boot;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

@WebFilter(filterName = "indexFilter", urlPatterns = "/*")
@Slf4j
public class ExtFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("init");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.info("doFilter");
		chain.doFilter(request, response);
	}

	public void destroy() {
		log.info("destroy");
	}

}
