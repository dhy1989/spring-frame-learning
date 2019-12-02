package com.dhy.demo.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author dinghy
 * @date 2019/12/2
 */
@Component
public class Cat implements InitializingBean,DisposableBean{

    public Cat() {
        System.out.println("cat............constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy................");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet............");
    }
}
