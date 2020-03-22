package com.ecsimsw.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    Body body;

    @Autowired
    public Person(Body body){
        this.body = body;
    }

    void say(){
        System.out.println("hi");
        System.out.println(body != null);
    }
}
