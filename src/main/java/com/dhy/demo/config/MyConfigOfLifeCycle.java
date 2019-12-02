package com.dhy.demo.config;

import com.dhy.demo.entity.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author dinghy
 * @date 2019/12/1
 *  <p>
 *    1)指定初始化方法,通过 @Bean(initMethod = "init",destroyMethod = "destroy")
 *    2)通过Bean实现InitializingBean,DisposableBean接口
 *    3)可以使用JSR250;
 *      @PostConstruct,在bean创建完成并且属性赋值完成,来执行此方法
 *      @PreDestroy,在容器销毁benan之前执行
 *    4)BeanPostProcessor:
 *        postProcessBeforeInitialization在初始化之前工作
 *        postProcessAfterInitialization在初始化之后工作
 * </p>
 */
@Configuration
@ComponentScan("com.dhy.demo")
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
