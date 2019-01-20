package com.fibers.demo.spring.controller;

import com.fibers.demo.spring.model.Spittle;
import com.fibers.demo.spring.repository.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private final static String MAX_LONG_AS_STRING = "" + Long.MAX_VALUE;

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(@RequestParam(value = "max",
            defaultValue = MAX_LONG_AS_STRING) long max,
                                  @RequestParam("count") int count) {
        return spittleRepository.findSpittles(max, 20);
    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String showSpittle(
            @PathVariable("spittleId") long spittleId,
            Model model) {
        Spittle spittle = spittleRepository.findOne(spittleId);
        model.addAttribute(spittle);

        return "spittle";
    }

}
