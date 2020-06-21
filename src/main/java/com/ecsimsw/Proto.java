package com.ecsimsw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Proto {

    @Autowired
    Proto2 proto2;

    public Proto2 getProto2() {
        return proto2;
    }
}
