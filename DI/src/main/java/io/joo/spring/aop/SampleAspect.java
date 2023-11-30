package io.joo.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@org.aspectj.lang.annotation.Aspect
@Component
public class SampleAspect {
    @Before("execution(* io.joo.spring.greet.*Greet.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        // 시작 부분 표시
        System.out.println("==== Before Advice ====");

        // 날짜 출력
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));

        // 이름 출력
        System.out.println(String.format("메서드:%s", joinPoint.getSignature().getName()));
    }

}

