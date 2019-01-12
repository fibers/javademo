package com.fibers.demo.spring.bean.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.fibers.demo.spring.bean.model"})
public class AnimalConfig {


}
