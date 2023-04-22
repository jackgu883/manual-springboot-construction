package com.jackgu.controller.impl;

import com.jackgu.controller.HelloWebController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * 显示层接口实现类
 */
@Slf4j
@RestController
public class HelloWenControllerImpl implements HelloWebController {

    @Override
    public String sayHello() {
        String str = "Hello Web :)";
        //后台日志输出字符串！
        log.info("======【" + str + "】！");
        //页面显示返回字符串！
        return str;
    }
}
