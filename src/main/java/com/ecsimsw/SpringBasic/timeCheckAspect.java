package com.ecsimsw.SpringBasic;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class timeCheckAspect {
    @Around("@annotation(TimeCheck)")
    public Object func(ProceedingJoinPoint point) throws Throwable{
        long beging = System.currentTimeMillis();
        System.out.println("now acting : " + point.toString());

        Object retVal = point.proceed();
        System.out.println(System.currentTimeMillis() - beging);

        return retVal;
    }
}

// Aspect
// 1. 해야할 일 : advice
// 2. 어디서 적용 : pointcut
