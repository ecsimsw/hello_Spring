package com.ecsimsw.a;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


public class Application {
    public static void main(String[] args){
        //Bean Configuration by Java _ ApplicationConfig
        AnnotationConfigApplicationContext context =
           new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Person person = (Person)context.getBean(Person.class);
        person.say();



        //SpringApplication.run(Application.class, args);
    }
}