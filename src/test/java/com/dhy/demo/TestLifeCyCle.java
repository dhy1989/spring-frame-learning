package com.dhy.demo;

import com.dhy.demo.config.MainConfProfile;
import com.dhy.demo.config.MyConfigOfLifeCycle;
import com.dhy.demo.entity.Yellow;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

/**
 * @author dinghy
 * @date 2019/12/1
 */
public class TestLifeCyCle{
    @Test
    public void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigOfLifeCycle.class);
        System.out.println("容器创建完成");
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfProfile.class);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Yellow.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }

    @Test
    public  void test3(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        environment.setActiveProfiles("test","dev");
        applicationContext.register(MainConfProfile.class);
        applicationContext.refresh();
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Yellow.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        applicationContext.close();
    }
}
