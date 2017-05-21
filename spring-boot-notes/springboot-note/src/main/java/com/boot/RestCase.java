package com.boot;

public class RestCase {

	/**
	 * Representational State Transfer
	 * 表现层状态转化
	 */
	
	/**
	 * org.springframework.web.filter.HiddenHttpMethodFilter
	 * <input type="hidden" name="_method" value="put" />
	 */
}
// https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN
// https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN
// https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN

//GET 从指定的url上获取内容
//POST 提交body中的内容给服务器中指定的url中，属于非幂等的(non-idempotent)请求
//HEAD 从指定的url上获取header内容(类似Get方式)
//TRACE Allows a programmer to see how the client's message is modified as it passes through a series of proxy servers. The recipient of a TRACE method echoes the HTTP request headers back to the client
//PUT 将body上传至服务器指定url处
//DELETE 在指定url处删除资源
//OPTIONS 获取指定url中能接收的请求方法
//CONNECT 连接指定频段。当客户端需要通过代理服务器连接HTTPS服务器是用到。

