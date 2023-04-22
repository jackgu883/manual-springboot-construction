package com.jackgu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 显示层接口类
 */
@RestController
@RequestMapping("/public")
public interface HelloWebController {

    @RequestMapping("/sayhello")
    String sayHello();
}
