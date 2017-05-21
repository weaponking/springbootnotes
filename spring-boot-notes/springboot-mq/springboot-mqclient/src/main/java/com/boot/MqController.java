package com.boot;

import java.util.Date;
import java.util.UUID;
import javax.jms.Queue;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.boot.vo.MqVo;

@RestController
public class MqController {

	@Autowired
	private JmsMessagingTemplate jmsTemplate;
	@Autowired
    private Queue queue;
	@Autowired
    private Queue objQueue;
	
	@GetMapping("/mq") 
	public MqVo mq() {
		MqVo vo = new MqVo();
		vo.setId(UUID.randomUUID().toString());
		vo.setName("msg"+RandomUtils.nextInt());
		vo.setCreateTime(new Date());
		vo = jmsTemplate.convertSendAndReceive(objQueue, vo, MqVo.class);
		return vo;
	}
	
	@GetMapping("/str") 
	public String str() {
		return jmsTemplate.convertSendAndReceive(queue, " world", String.class);
	}
}
