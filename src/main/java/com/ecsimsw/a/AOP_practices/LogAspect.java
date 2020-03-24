package com.ecsimsw.a.AOP_practices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.Signature;


@Component
@Aspect
public class LogAspect {
    @Around("@annotation(getName)")
    public Object logStartEnd(ProceedingJoinPoint pj){
        Object result = null;
        try {
            Signature signature = pj.getSignature();
            System.out.println("start : "+signature.getName());;

            result = pj.proceed();

            System.out.println("end : "+signature.getName());

        } catch (Throwable throwable) {
            System.out.println("exception!");
        }
        return result;
    }
}
