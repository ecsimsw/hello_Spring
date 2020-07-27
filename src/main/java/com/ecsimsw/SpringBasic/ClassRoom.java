package com.ecsimsw.SpringBasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassRoom {
    @Autowired(required = false)
    public Student getStudent(Student student){
        return student;
    }
}
