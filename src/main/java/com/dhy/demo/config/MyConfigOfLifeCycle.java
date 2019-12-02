package com.dhy.demo.config;

import com.dhy.demo.entity.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author dinghy
 * @date 2019/12/1
 */
@Configuration
@ComponentScan("com.dhy.demo.entity")
public class MyConfigOfLifeCycle {

    /**
     *@Description prototype模式 spring容器只负责创建
     *@Author dinghy
     *@Date 2019/12/1 19:27
     */
    @Scope("singleton")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }
}
