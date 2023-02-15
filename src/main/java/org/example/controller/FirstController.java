package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: FirstController
 * @description: 第一个Controller
 * @author: sh.Liu
 * @date: 2022-01-10 15:21
 */
@RestController
public class FirstController {

    @Value("${third.weather.url}")
    private String weatherUrl;

    @RequestMapping("/hello")
    public String helloWorld() {
        System.out.println("获取到的天气地址为：" + weatherUrl);
        return "hello world";
    }
}