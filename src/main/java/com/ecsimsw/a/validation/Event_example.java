package com.ecsimsw.a.validation;

import com.ecsimsw.a.applicationEventPublisher.Event;

import javax.validation.constraints.*;

public class Event_example {

    @NotEmpty
    String name;

    @NotNull @Min(1) @Max(99)
    int age;

    public Event_example(String name, int age){
        this.name= name;
        this.age = age;
    }
    public Event_example(int age){
        this.age = age;
    }
}
