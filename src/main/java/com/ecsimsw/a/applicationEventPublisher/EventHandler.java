package com.ecsimsw.a.applicationEventPublisher;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {
    @EventListener
    @Async
    public void handle_getName(Event e){
        System.out.println(Thread.currentThread());
    }

    @EventListener
    @Async
    public void handle_getNumber(Event e){
        System.out.println(Thread.currentThread());
    }
}
