package com.jackgu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public interface HelloWebController {

    @RequestMapping("/sayhello")
    String sayHello();
}
