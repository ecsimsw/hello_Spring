package com.ecsimsw.SpringBasic;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {

        ApplicationContext ctx
                = new AnnotationConfigApplicationContext(ApplicationConfigure.class);

        Action action = (Action)ctx.getBean("action");
        action.action1();
        action.action2();

    }
}