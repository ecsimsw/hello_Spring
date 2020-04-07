package com.ecsimsw.a;

import com.ecsimsw.a.resourceLoader.RL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.io.Resource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements org.springframework.boot.ApplicationRunner {

    @Autowired
    org.springframework.core.io.ResourceLoader resourceLoader;

    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        RL rl = new RL(ctx);
    }
}