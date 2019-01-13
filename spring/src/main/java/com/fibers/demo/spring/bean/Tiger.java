package com.fibers.demo.spring.bean;

import com.fibers.demo.spring.iface.Animal;
import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal {

    @Override
    public void run() {
        System.out.print("Tiger is running");
    }

}
