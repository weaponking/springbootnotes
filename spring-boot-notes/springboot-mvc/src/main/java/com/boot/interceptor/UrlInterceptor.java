package com.boot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.boot.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class UrlInterceptor implements HandlerInterceptor {

	private static final ThreadLocal<Long> startTimeThreadLocal =
			new NamedThreadLocal<Long>("system runtime");
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, 
			Object handler) throws Exception {
		if (log.isDebugEnabled()){
			long beginTime = System.currentTimeMillis();
	        startTimeThreadLocal.set(beginTime);		
	        log.debug("开始计时: {}  URI: {}", DateUtil.formatDateTime(beginTime), request.getRequestURI());
		}
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, 
			ModelAndView modelAndView) throws Exception {
		if (modelAndView != null){
			log.info("ViewName: " + modelAndView.getViewName());
		}
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
			Object handler, Exception ex) throws Exception {
		if (log.isDebugEnabled()){
			long beginTime = startTimeThreadLocal.get();
			long endTime = System.currentTimeMillis(); 
			log.debug("计时结束：{}  耗时：{}  URI: {}  最大内存: {}m  已分配内存: {}m  已分配内存中的剩余空间: {}m  最大可用内存: {}m",
					DateUtil.formatDateTime(endTime), DateUtil.formatDateTime(endTime - beginTime),
					request.getRequestURI(), Runtime.getRuntime().maxMemory()/1024/1024, Runtime.getRuntime().totalMemory()/1024/1024, Runtime.getRuntime().freeMemory()/1024/1024, 
					(Runtime.getRuntime().maxMemory()-Runtime.getRuntime().totalMemory()+Runtime.getRuntime().freeMemory())/1024/1024); 
	        startTimeThreadLocal.remove();
		}
	}
}
