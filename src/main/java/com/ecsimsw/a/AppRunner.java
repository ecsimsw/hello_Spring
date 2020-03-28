package com.ecsimsw.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    Environment environment;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        String item = environment.getProperty("item");
        System.out.println(item);
    }

    @Autowired
    Person person;
}
