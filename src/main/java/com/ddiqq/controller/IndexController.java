package com.ddiqq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@Slf4j
@RequestMapping("/index")
public class IndexController {
    @PostConstruct
    public void init(){
      log.info("init " + this.getClass());
    }

    @GetMapping("")
    public String index(){
        return "hello world";
    }
}
