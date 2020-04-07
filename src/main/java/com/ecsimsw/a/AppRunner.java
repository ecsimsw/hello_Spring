package com.ecsimsw.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.io.Resource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class AppRunner implements org.springframework.boot.ApplicationRunner {

    @Autowired
    org.springframework.core.io.ResourceLoader resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Resource resource = resourceLoader.getResource("classpath:test.txt");
        System.out.println(resource.exists());
    }
}