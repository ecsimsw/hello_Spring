package com.ecsimsw.a.web;

import com.ecsimsw.a.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.hamcrest.Matchers.is;

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
    }

    @Test
    public void doesReturnMaster() throws Exception {
        String master = "jinhwan";
        mvc.perform(get("/master"))
                .andExpect(status().isOk())
                .andExpect(content().string(master));
    }

    @Test
    public void doesReturnHelloDto() throws Exception{
        String name ="jinhwan";
        int age =24;

        mvc.perform(
                get("/hello/dto")
                        .param("name", name)
                        .param("age", String.valueOf(age))
        ).andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.age",is(age)));
    }
}