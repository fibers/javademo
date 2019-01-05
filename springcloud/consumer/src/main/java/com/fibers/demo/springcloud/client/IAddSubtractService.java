package com.fibers.demo.springcloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fibers on 2017/6/23.
 */

@FeignClient("service-add-subtract")
public interface IAddSubtractService {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Float add(@RequestParam(value = "a") Float a, @RequestParam(value = "b") Float b);

    @RequestMapping(method = RequestMethod.GET, value = "/subtract")
    Float subtract(@RequestParam(value = "a") Float a, @RequestParam(value = "b") Float b);
}
