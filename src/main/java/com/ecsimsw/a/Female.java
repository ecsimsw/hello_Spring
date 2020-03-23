package com.ecsimsw.a;

import org.springframework.stereotype.Component;

@Component
public class Female implements Body {
    public void gender(){
        System.out.println(this.getClass());
    }
}
