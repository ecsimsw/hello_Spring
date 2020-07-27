package com.ecsimsw.SpringBasic;

import org.springframework.stereotype.Component;

@Component
public class Action {

    @TimeCheck
    public void action1() throws InterruptedException {
        System.out.println("action1 Start");
        Thread.sleep(1000);
        System.out.println("action1 End");
    }

    @TimeCheck
    public void action2() throws InterruptedException {
        System.out.println("action2 Start");
        Thread.sleep(1000);
        System.out.println("action2 End");
    }
}
