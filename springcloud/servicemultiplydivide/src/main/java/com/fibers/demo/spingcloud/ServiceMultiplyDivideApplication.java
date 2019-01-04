package com.fibers.demo.spingcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceMultiplyDivideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMultiplyDivideApplication.class, args);
    }
}
