package com.ecsimsw;

import java.util.Arrays;

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

@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ApplicationConfigure.class);

        Proto proto1 = ctx.getBean(Proto.class);
        Proto proto2 = ctx.getBean(Proto.class);

        Singleton singleton1 = ctx.getBean(Singleton.class);
        Singleton singleton2 = ctx.getBean(Singleton.class);

        System.out.println(proto1.hashCode());
        System.out.println(proto1.getProto2());
        System.out.println(proto2.hashCode());
        System.out.println(proto2.getProto2());
        System.out.println(singleton1.hashCode());
        System.out.println(singleton1.getProto2());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton2.getProto2());
    }
}