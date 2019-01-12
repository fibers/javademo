package com.fibers.demo.spring.bean;

import com.fibers.demo.spring.iface.IAnimal;
import org.springframework.stereotype.Component;

@Component
public class Tiger implements IAnimal {

    @Override
    public void run() {
        System.out.print("Tiger is running");
    }

}
