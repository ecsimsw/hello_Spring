package com.ecsimsw.MVC;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class SampleController {
    // pathVariable
    @GetMapping(value="/hello/{id}")
    public String hello(@PathVariable Integer id){
        // @PathVariable("id") String something
        // 자동 형 변환 
        return String.valueOf(id);
    }
}

