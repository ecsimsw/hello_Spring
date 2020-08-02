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
public String hello1(@PathVariable(value = "name",required = false) Integer id){
    // @PathVariable("id") String something
    // 자동 형 변환
    return String.valueOf(id);
}

    // form 이든 uri 변수이든 스프링은 결국 @RequestParam으로 처리한다.
    // "/hello?name=jinhwan&key=value"
    @GetMapping(value="/hello")
    public String hello(@RequestParam("name") String id, @RequestParam String key,
                        @RequestParam(name="age", defaultValue = "0") String age){
        return id+key+age;
    }

    // ModelAttribute 복합 타입 객체를 받음
    @GetMapping(value="/member")
    public String member(@ModelAttribute Member member){
        return member.name;

        WebRequest request;
        request.
    }
}

