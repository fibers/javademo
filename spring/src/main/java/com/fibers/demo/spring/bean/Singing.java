package com.fibers.demo.spring.bean;

import com.fibers.demo.spring.iface.IPerformance;

public class Singing implements IPerformance {

    @Override
    public void perform() {
        System.out.println("Singing a song");
    }
}
