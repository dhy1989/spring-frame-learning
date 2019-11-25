package com.dhy.demo;

import com.dhy.demo.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dinghy
 * @date 2019/11/25
 */
public class TestApplication {
    @Test
    public void testXml(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
