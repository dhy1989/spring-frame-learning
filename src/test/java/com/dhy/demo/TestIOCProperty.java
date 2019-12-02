package com.dhy.demo;

import com.dhy.demo.config.AppConfig;
import com.dhy.demo.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.io.UnsupportedEncodingException;

/**
 * @author dinghy
 * @date 2019/12/2
 */
public class TestIOCProperty {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    @Test
    public void test() throws UnsupportedEncodingException {
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
        Environment environment = applicationContext.getEnvironment();
        String age = environment.getProperty("age");
        System.out.println(age);
        String nickName=environment.getProperty("nickName");
        System.out.println(new String (nickName.getBytes(),"UTF-8"));
    }
}
