package com.bharath.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class LocalTaskScheduler {

    private static final Logger log = LoggerFactory.getLogger(LocalTaskScheduler.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelay = 1000L)
    public void  schedule() throws InterruptedException {
        Thread.sleep(3000L);
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
