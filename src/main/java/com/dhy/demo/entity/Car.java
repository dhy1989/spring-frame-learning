package com.dhy.demo.entity;

/**
 * @author dinghy
 * @date 2019/12/1
 */
public class Car {
    public Car() {
        System.out.println("car.....constructor");
    }
    public void init(){
        System.out.println("初始化方法");
    }

    public void destroy(){
        System.out.println("销毁方法");
    }
}
