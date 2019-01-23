package com.fibers.demo.spring.pojo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ExtensionIntroducer {

    @DeclareParents(value = "com.fibers.demo.spring.pojo.aop.Performance+",
            defaultImpl = CleanExtension.class)
    public Extension extension;
}
