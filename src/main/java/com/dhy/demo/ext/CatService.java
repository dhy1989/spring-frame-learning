package com.dhy.demo.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author dinghy
 * @date 2020/1/9 17:15
 * <p>
 *     可以使用@EventListener注解将某个方法作为监听器
 *     通过EventListenerMethodProcessor进行将这个方法包装成监听器
 * </p>
 */
@Service
public class CatService {
    @EventListener({ApplicationEvent.class})
    public void listen(ApplicationEvent event){
        System.out.println("service------>"+event);
    }
}
