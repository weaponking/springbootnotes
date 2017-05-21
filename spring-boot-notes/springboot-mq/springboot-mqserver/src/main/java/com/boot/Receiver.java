package com.boot;

import java.util.Date;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import com.boot.vo.MqVo;
import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class Receiver {
	
	@JmsListener(destination = "obj.queue")
    public MqVo receiveQueue(MqVo model) throws InterruptedException {
        log.info("obj.queue-->"+model.toString());
        Thread.sleep(3000l);
        model.setCreateTime(new Date());
        return model;
    }
	
	@JmsListener(destination = "text.queue")
    public String receiveQueue(String source) throws InterruptedException {
        log.info("text.queue-->"+source.toString());
        return "hello "+source;
    }
}
