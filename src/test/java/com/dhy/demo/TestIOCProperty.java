package com.dhy.demo;

import com.dhy.demo.config.AppConfig;
import com.dhy.demo.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dinghy
 * @date 2019/12/2
 */
public class TestIOCProperty {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    @Test
    public void test(){
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }
}
