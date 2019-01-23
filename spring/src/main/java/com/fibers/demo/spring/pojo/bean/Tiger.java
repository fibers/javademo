package com.fibers.demo.spring.pojo.bean;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal {

    @Override
    public void run() {
        System.out.print("Tiger is running");
    }

}
