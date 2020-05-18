package com.jenkins.test.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String hello() {
        return "test the new spring boot!";
    }
}

