package com.ecsimsw.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.core.env.Environment;

@Component
@Profile("A_Group")
@PropertySource("classpath:/application.properties")
public class Person {
    @Autowired
    ApplicationContext ctx;

    @Autowired
    Environment environment;

    @Profile("A_Group")
    public void id(){
        Environment environment = ctx.getEnvironment();
        String id = environment.getProperty("test.id");
        System.out.println(id);

        String pw = environment.getProperty("test.id");
        System.out.println(pw);
    }
}
