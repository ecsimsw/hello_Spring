package com.ecsimsw.a.web;

import com.ecsimsw.a.AOP_practices.getName;
import com.ecsimsw.a.web.dto.HelloResponseDto;
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
        return "hello";
    }
}