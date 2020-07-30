package com.ecsimsw.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping() // 클래스 안 모든 핸들러에 적용한다.
public class SampleController {

    // Method를 지정하지 않으면 모든 http method를 다 받음
    // GET, POST, PUT, PATCH, DELETE
    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(){
        return "hello";
    }

    // GET : 서버 리소스 요청, idempotent
    // POST : 서버의 리소스 수정, 생성
    // PUT : URI는 보내는 데이터에 해당하는 리소스를 지칭, idempotent
    // PATCH : 기존 엔티티와 새 테이터의 차이점만 보냄, idempotent
    // DELETE : URI에 해당하는 리소스 삭제 요청, idempotent
}

