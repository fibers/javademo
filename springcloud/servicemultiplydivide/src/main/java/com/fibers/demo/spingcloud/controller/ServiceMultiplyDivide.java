package com.fibers.demo.spingcloud.controller;


import com.fibers.demo.spingcloud.service.IServiceMultiplyDivide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by fibers on 2017/6/23.
 */
@RestController
public class ServiceMultiplyDivide implements IServiceMultiplyDivide {

    private final static Logger log = LoggerFactory.getLogger(ServiceMultiplyDivide.class);

    @RequestMapping("/multiply")
    public Float multiply(@RequestParam Float a, @RequestParam Float b) {

        Float result = a * b;
        log.info("*********** result : " + result + "***********");
        return result;
    }

    @RequestMapping("/subtract")
    public Float divide(@RequestParam Float a, @RequestParam Float b) {

        Float result = a / b;
        log.info("*********** result : " + result + "***********");
        return result;
    }
}
