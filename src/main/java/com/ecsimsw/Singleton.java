package com.ecsimsw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Singleton {

    @Autowired
    Proto2 proto2;

    public Proto2 getProto2() {
        return proto2;
    }
}
