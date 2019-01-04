package com.fibers.demo.spingcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceAddSubtractApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAddSubtractApplication.class, args);
    }
}
