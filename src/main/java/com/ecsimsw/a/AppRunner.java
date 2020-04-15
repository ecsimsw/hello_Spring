package com.ecsimsw.a;

import com.ecsimsw.a.applicationEventPublisher.Event;
import com.ecsimsw.a.resourceLoader.RL;
import com.ecsimsw.a.validation.Validation;
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
import org.springframework.validation.Validator;
@Component
public class AppRunner implements org.springframework.boot.ApplicationRunner {

    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println(validator);

        Validation v = new Validation(validator);

    }
}