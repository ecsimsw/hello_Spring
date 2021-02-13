package com.ecsimsw.SpringBasic;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ApplicationTest extends TestCase {
    @Test
    public void componentScanScopeTest(){
        ApplicationContext ctx = Application.getCtx();
        ctx.getBean("classRoom");

        assertThatThrownBy(()->{
            ctx.getBean("testComponent");
        }).isInstanceOf(Exception.class);
    }
}