package com.ecsimsw.MVC;

import lombok.*;

import java.time.LocalDateTime;

// model : pojo 객체

@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Event {
    private String name;
    private LocalDateTime time;
}
