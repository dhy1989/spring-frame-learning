package com.dhy.demo;

;
import com.dhy.demo.config.AppConfig;
import com.dhy.demo.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dinghy
 * @date 2019/11/25
 */
public class TestApplication {
    @Test
    public void testXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    @Test
    public void testAnonation() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("****"+beanDefinitionName);
        }
    }

    @Test
    public void testComponentScan() {
        printBeans();
    }

    @Test
    public void testScope(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person2 = (Person) applicationContext.getBean("person2");
        System.out.println(person2);

    }

    @Test
    public void tetCondition(){
        printBeans();
    }

    private void printBeans() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void testImport(){
        printBeans();
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Object colorFactoryBean = applicationContext.getBean("colorFactoryBean");
        Object bean = applicationContext.getBean("&colorFactoryBean");
        System.out.println("colorFactoryBean的类型是:"+colorFactoryBean.getClass());
        System.out.println(bean.getClass());
    }
}
