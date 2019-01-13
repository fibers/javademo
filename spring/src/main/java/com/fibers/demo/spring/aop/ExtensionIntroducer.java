package com.fibers.demo.spring.aop;

import com.fibers.demo.spring.bean.CleanExtension;
import com.fibers.demo.spring.iface.Extension;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ExtensionIntroducer {

    @DeclareParents(value = "com.fibers.demo.spring.iface.Performance+",
            defaultImpl = CleanExtension.class)
    public Extension extension;
}
