package com.fibers.demo.springcloud.controller;

import com.fibers.demo.springcloud.client.AddSubtractService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fibers on 2017/6/23.
 */
@RestController
public class FeignController {

    private final static Logger log = LoggerFactory.getLogger(FeignController.class);

    @Autowired
    AddSubtractService addSubtractClient;

    @GetMapping("/feign/{a}/{b}/{c}")

    public Float compute(@PathVariable Float a,
                         @PathVariable Float b,
                         @PathVariable Float c) {

        Float midResult = addSubtractClient.add(a,b);
        Float result = addSubtractClient.subtract(midResult, c);

        log.info("*********** result : " + result + "***********");

        return result;
    }
}
