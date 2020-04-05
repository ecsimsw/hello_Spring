package com.ecsimsw.a;

import com.ecsimsw.a.applicationEventPublisher.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class AppRunner implements org.springframework.boot.ApplicationRunner {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    ApplicationEventPublisher publisher;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        ctx.publishEvent(new Event("Event0",0));
    }
}