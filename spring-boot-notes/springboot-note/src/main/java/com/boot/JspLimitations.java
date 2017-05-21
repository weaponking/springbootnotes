package com.boot;

public class JspLimitations {
		
//	  When running a Spring Boot application that uses an embedded servlet container 
//		(and is packaged as an executable archive), there are some limitations in the JSP support.
//
//    With Tomcat it should work if you use war packaging, i.e. an executable war will work, 
//    	and will also be deployable to a standard container (not limited to, but including Tomcat). 
//    		An executable jar will not work because of a hard coded file pattern in Tomcat.
//    		
//    With Jetty it should work if you use war packaging, i.e. an executable war will work, 
//    	and will also be deployable to any standard container.
//    
//    Undertow does not support JSPs.
//    
//    Creating a custom error.jsp page won’t override the default view for error handling, 
//    	custom error pages should be used instead.
//
//    There is a JSP sample so you can see how to set things up.
}
