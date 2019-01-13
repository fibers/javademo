package com.fibers.demo.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AudienceParameterPointcut {

    @Pointcut("execution(* " +
            "com.fibers.demo.spring.iface.Performance.perform_parameterPointcut(String))" +
            " && args(what)")
    public void performance(String what) {
    }


    @Around("performance(what)")
    public void watchPerformance(ProceedingJoinPoint pjp, String what) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            pjp.proceed(pjp.getArgs());
//            pjp.proceed(new String[]{what});
            System.out.println("CLAP CLAP CLAP");
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }
}
