package com.dhy.demo.config;

import com.dhy.demo.condition.LinuxCondition;
import com.dhy.demo.condition.WindowCondition;
import com.dhy.demo.entity.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @author dinghy
 * @date 2019/11/26 11:55
 * <p>
 *     @ComponentScan.Filter 指定过滤规则
 *     @Lazy 当对象使用的时候才创建,只能用于单例模式
 *     @Conditional 定义类加载条件,需要实现Condition接口,如果配置在类上,当前配置类里边所有实例都要进行判断
 * </p>
 */
@Configuration
@ComponentScan(value="com.dhy.demo",excludeFilters ={@ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class})} )
public class AppConfig {
    @Bean
    public Person person1() {
        return new Person("李四", 18);
    }

   // @Scope("prototype")
    @Lazy
    @Bean
    public  Person person2(){
        System.out.println("对象创建了");
        return new Person("王五",18);
    }

    @Conditional(WindowCondition.class)
    @Bean
    public Person person3(){
        return new Person("Bill Gates",40);
    }

    @Conditional(LinuxCondition.class)
    @Bean
    public Person person4(){
        return new Person("Linux",50);
    }
}
