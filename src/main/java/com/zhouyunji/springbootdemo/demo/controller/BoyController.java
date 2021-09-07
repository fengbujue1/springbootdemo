package com.zhouyunji.springbootdemo.demo.controller;

import com.zhouyunji.bean.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoyController {
    @Autowired
    private BoyService boyService;

    @GetMapping("/boy")
    public String boy() {
        return boyService.doSomething();
    }

}
