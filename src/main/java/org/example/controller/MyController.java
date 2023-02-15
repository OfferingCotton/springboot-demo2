package org.example.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @author Trevor
 */
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
@Controller
public class MyController {
    @GetMapping("/firstController")
    public String firstController() {
        return ("Hello world!");
    }
}
