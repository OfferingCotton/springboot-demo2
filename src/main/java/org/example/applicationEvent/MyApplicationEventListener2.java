package org.example.applicationEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @className: MyApplicationEventListener2
 * @description: 注解实现监听器
 * @author: sh.Liu
 * @date: 2022-03-23 15:56
 */
@Component
public class MyApplicationEventListener2 {

    @EventListener
    public void onEvent(MyApplicationEvent event){
        System.out.println("收到消息2：" + event);
    }


}
