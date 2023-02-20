package org.example.applicationEvent;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

/**
 * @className: MyApplicationEvent
 * @description: 事件封装
 * @author: sh.Liu
 * @date: 2022-03-23 14:41
 */
@Getter
@Setter
@ToString
public class MyApplicationEvent extends ApplicationEvent {

    private Integer age;

    private String name;

    /**
     * 需要重写构造方法
     * @param source
     * @param name
     * @param age
     */
    public MyApplicationEvent(Object source, String name, Integer age) {
        super(source);
        this.name = name;
        this.age = age;
    }
}