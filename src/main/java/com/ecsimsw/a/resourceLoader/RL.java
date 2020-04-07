package com.ecsimsw.a.resourceLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class RL {
    @Autowired
    org.springframework.core.io.ResourceLoader resourceLoader;

    public RL(){
        Resource resource = resourceLoader.getResource("classpath:test.txt");
        System.out.println(resource.exists());
    }
}
