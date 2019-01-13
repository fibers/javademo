package com.fibers.demo.spring.iface;

public interface Performance {
    void perform_pointcut();

    void perform_namedPointcut();

    void perform_parameterPointcut(String what);
}
