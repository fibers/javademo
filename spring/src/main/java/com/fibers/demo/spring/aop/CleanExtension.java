package com.fibers.demo.spring.aop;

import com.fibers.demo.spring.aop.Extension;

public class CleanExtension implements Extension {
    public void extension() {
        System.out.println("Clean");
    }
}
