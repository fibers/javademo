package com.fibers.demo.spring.bean;

import com.fibers.demo.spring.iface.Extension;

public class CleanExtension implements Extension {
    public void extension() {
        System.out.println("Clean");
    }
}
