package com.dhy.demo.entity;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author dinghy
 * @date 2019/11/29 17:51
 * <p>
 *     通过ApplicationContextAware可以在项目内部获取spring的容器
 * </p>
 */
@Component
public class Red implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
          this.applicationContext=applicationContext;
        System.out.println(applicationContext);
    }
}
