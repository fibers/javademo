package com.fibers.demo.spingcloud.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fibers on 2017/6/23.
 */

public interface IServiceAddSubtract {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Float add(@RequestParam(value = "a") Float a, @RequestParam(value = "b") Float b);

    @RequestMapping(method = RequestMethod.GET, value = "/subtract")
    Float subtract(@RequestParam(value = "a") Float a, @RequestParam(value = "b") Float b);
}
