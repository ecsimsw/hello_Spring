package com.ecsimsw.a.resourceLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.File;


@Component
public class RL {

    public RL(ApplicationContext resourceLoader) {
        //System.out.println(ctx.getApplicationName());
        Resource resource = resourceLoader.getResource("classpath:ecsimsw.txt");
        System.out.println(resource.exists());

    }
}
