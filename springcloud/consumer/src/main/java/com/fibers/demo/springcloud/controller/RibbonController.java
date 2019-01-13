package com.fibers.demo.springcloud.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by fibers on 2017/6/22.
 */
@RestController
public class RibbonController {

    private final static Logger log = LoggerFactory.getLogger(RibbonController.class);


    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "computeServiceFallback")
    @GetMapping("/ribbon/{a}/{b}/{c}")
    public Float compute(@PathVariable Float a,
                         @PathVariable Float b,
                         @PathVariable Float c) {
        Float addResult = this.restTemplate.getForObject(
                "http://service-add-subtract/add?a={a}&b={b}",
                Float.class, a, b);
        Float result = this.restTemplate.getForObject(
                "http://service-add-subtract/subtract?a={a}&b={b}",
                Float.class, addResult, c);

        log.info("*********** result : " + result + "***********");

        return result;
    }

    public Float computeServiceFallback(Float a, Float b, Float c) {
        return 0.0f;
    }
}
