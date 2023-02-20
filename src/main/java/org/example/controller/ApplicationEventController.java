package org.example.controller;

import org.example.applicationEvent.MyApplicationEvent;
import org.example.config.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: ApplicationEventController
 * @description:
 * @author: sh.Liu
 * @date: 2022-03-23 15:21
 */
@RestController
@RequestMapping("event")
public class ApplicationEventController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/push")
    public Result pushEvent(){
        MyApplicationEvent myApplicationEvent = new MyApplicationEvent(this,"zhangsan", 10);
        applicationContext.publishEvent(myApplicationEvent);
        return Result.success();
    }

    @RequestMapping("/push2")
    public Result pushEvent2(){
        applicationContext.publishEvent("大家好");
        return Result.success();
    }
}