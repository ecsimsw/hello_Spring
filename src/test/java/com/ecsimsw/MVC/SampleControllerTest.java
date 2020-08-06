package com.ecsimsw.MVC;

import com.ecsimsw.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest
public class SampleControllerTest{

    @Autowired
    MockMvc mockMvc;

    @Test
    public void hello() throws Exception{
        mockMvc.perform(
                get("/login").param("memberId", "ecsimsw"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(request().sessionAttribute("test",notNullValue()))
                .andExpect(handler().handlerType(SampleController.class));


        mockMvc.perform(
                get("/complete"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(handler().handlerType(SampleController.class))
                .andReturn().getRequest().getSession();
    }
}
