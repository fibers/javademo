package com.fibers.demo.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience2 {
    @Pointcut("execution(* com.fibers.demo.spring.iface.IPerformance.perform(..))")
    public void performance() {
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint pjp) {
        try{
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            pjp.proceed();
            System.out.println("CLAP CLAP CLAP");
        }catch(Throwable e){
            System.out.println("Demanding a refund");
        }
    }
}
