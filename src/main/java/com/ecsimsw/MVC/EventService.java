package com.ecsimsw.MVC;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {
    public List<Event> getEvents(){
        Event event1 = Event.builder()
                .name("springTest")
                .time(LocalDateTime.of(2020,07,28,5,20))
                .build();
        Event event2 = Event.builder()
                .name("JPATest")
                .time(LocalDateTime.of(2020,05,28,5,20))
                .build();
        return List.of(event1, event2);
    }
}
