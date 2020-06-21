package com.ecsimsw;

import java.io.IOException;
import java.util.Arrays;

import com.sun.org.apache.xml.internal.utils.res.XResourceBundle;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

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