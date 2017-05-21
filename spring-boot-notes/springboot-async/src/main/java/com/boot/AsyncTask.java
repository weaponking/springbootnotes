package com.boot;

import java.util.Random;
import java.util.concurrent.Future;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class AsyncTask {

	@Async
    public Future<String> doTask() throws Exception {
        long start = System.currentTimeMillis();
        Thread.sleep(new Random().nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("task 耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("AsyncTask completed");
    }
	
}
