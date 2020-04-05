package com.ecsimsw.a.applicationEventPublisher;

public class Event {

    private String eventName;
    private int eventNumber;

    public Event(String eventName, int Number){
        this.eventName = eventName;
        this.eventNumber = Number;
    }

    public String getEventName() {
        return eventName;
    }

    public int getEventNumber() {
        return eventNumber;
    }
}
