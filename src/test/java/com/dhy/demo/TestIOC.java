package com.dhy.demo;

import com.dhy.demo.config.MyConfigOfLifeCycle;
import com.dhy.demo.entity.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dinghy
 * @date 2019/12/1
 */
public class TestIOC {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigOfLifeCycle.class);
        System.out.println("容器创建完成");
        Car car = (Car) applicationContext.getBean("car");
    }

    public void test2(){

    }
}
