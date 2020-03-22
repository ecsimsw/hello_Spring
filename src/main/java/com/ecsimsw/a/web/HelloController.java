package com.ecsimsw.a.web;

import com.ecsimsw.a.getName;
import com.ecsimsw.a.web.dto.HelloResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("age") int age)
    {
        return new HelloResponseDto(name, age);
    }

    @getName
    @GetMapping("/aspectTest")
    public String aspect(){

        for(int i=0; i<1000; i++){
            if(i%100 ==0){
                System.out.println(i);
            }
        }

        return "hello";
    }


    @Autowired
    String jinhwan;

    @getName
    @GetMapping("/master")
    public String master(){
        return  jinhwan;
    }

}