package com.ecsimsw.a.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
//Jnit 프레임워크에서 Runner을 실행할 때, 'SpringRunner' 실행자도 같이 실행시킨다.
@WebMvcTest(controllers = HelloController.class)
//스프링 테스트 어노테이션 중, spring MVC에 집중할 수 있도록 한다.

public class HelloControllerTest {
    @Autowired
    // 스프링이 관리하는 Bean을 주입한다.

    private MockMvc mvc;
    // spring MVC 테스트의 시작점

    @Test
    public void doesReturnHello() throws Exception{
        String hello = "hello";
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));

        // '/hello'로 get 요청을 하고, status가 200이 맞는지, content가 'hello'가 맞는지 확인한다.
    }
}