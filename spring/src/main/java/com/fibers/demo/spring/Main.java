package com.fibers.demo.spring;

import com.fibers.demo.spring.config.GlobalConfig;
import com.fibers.demo.spring.pojo.aop.Extension;
import com.fibers.demo.spring.pojo.aop.Performance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext acXML = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        System.out.println(acXML.getBean("user"));

        ApplicationContext acConfig = new AnnotationConfigApplicationContext(GlobalConfig.class);
        Performance performance = (Performance) acConfig.getBean("singing");
        performance.perform_parameterPointcut("hello world");

        ((Extension) performance).extension();
    }
}
