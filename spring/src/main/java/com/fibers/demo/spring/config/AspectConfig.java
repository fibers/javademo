package com.fibers.demo.spring.config;

import com.fibers.demo.spring.aop.Audience1;
import com.fibers.demo.spring.bean.Singing;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {

    @Bean
    public Audience1 audience() {
        return new Audience1();
    }

    @Bean
    public Singing singing() {
        return new Singing();
    }
}
