package com.ecsimsw.a;

import com.ecsimsw.a.applicationEventPublisher.Event;
import com.ecsimsw.a.resourceLoader.RL;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements org.springframework.boot.ApplicationRunner {

    @Autowired
    ResourceLoader resourceLoader;

    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println(resourceLoader.getClass());

        var ctx = new ClassPathXmlApplicationContext();
        System.out.println(ctx.getClass());


        Resource resource_classPath = resourceLoader.getResource("classpath:ecsimsw.txt");
        System.out.println(resource_classPath.getClass());
        System.out.println(resource_classPath.exists());
        System.out.println(resource_classPath.getDescription());
    }
}