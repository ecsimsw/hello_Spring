package com.ecsimsw.a.DI_practices;

import org.springframework.stereotype.Component;

@Component
public class Female implements Body {
    public void gender(){
        System.out.println(this.getClass());
    }
}
