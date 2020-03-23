package com.ecsimsw.a;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Male implements Body {
    public void gender(){
        System.out.println(this.getClass());
    }
}
