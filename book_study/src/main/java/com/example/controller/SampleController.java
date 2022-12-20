package com.example.controller;

import com.example.domain.SampleDTO;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
    @RequestMapping("")
    public void basic() {
        log.info(("-------basic--------"));
    }

    @RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
    public void basicTest() {
        log.info("--------get, post---------");
    }

    @GetMapping("/ex01")
    public String ex01(SampleDTO sample) {
        log.info("" + sample);
        return "ex01";
    }

}
