package com.ecsimsw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigure {

    @Bean
    public Student student(){
        return new Student();
    }
}
