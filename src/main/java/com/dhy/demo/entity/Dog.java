package com.dhy.demo.entity;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author dinghy
 * @date 2019/12/2
 */
@Component
public class Dog implements ApplicationContextAware{
    private ApplicationContext applicationContext;

    public Dog() {
        System.out.println("dog....constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("dog...init...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("dog....destroy..");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       this.applicationContext=applicationContext;
    }
}
