package com.javaboy.document.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yayu
 * @title: TestController
 * @description: TODO
 * @date 2021/2/2 17:12
 */
@RestController
@RequestMapping
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @RequestMapping("/test")
    public void test(){
        logger.info("hello logstash");
        logger.info("123我是321----------------------------------------------------");
    }

}
