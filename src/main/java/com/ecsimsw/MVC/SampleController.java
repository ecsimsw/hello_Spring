package com.ecsimsw.MVC;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {
    @RequestMapping(value="hello", headers = HttpHeaders.AGE)
    @PostMapping
    public String Test1(){
        return "hello";
    }
    @RequestMapping(value="hello", headers = "!"+HttpHeaders.AGE)
    public String Test2(){
        return "hello";
    }
    @RequestMapping(value="hello", headers = HttpHeaders.AGE+"=111")
    public String Test3(){
        return "hello";
    }

    @RequestMapping(value="hello", params = "name=test")
    public String Test4(){
        return "hello";
    }
}

