package com.ecsimsw.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println(messageSource.getClass());

        System.out.println("== Greeting == ");
        System.out.println(messageSource.getMessage("greet",null, Locale.KOREA));
        System.out.println(messageSource.getMessage("greet",null, Locale.US));

        System.out.println("== login == ");
        String id = "ecsimsw";
        System.out.println(messageSource.getMessage("login", new String[]{id}, Locale.KOREA));
        System.out.println(messageSource.getMessage("login", new String[]{id}, Locale.US));
    }
}
