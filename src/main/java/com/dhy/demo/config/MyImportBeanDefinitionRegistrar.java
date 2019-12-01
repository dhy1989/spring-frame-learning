package com.dhy.demo.config;

import com.dhy.demo.entity.RainBow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author dinghy
 * @date 2019/12/1
 */
    public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
        /**
         *@Description importingClassMetadata 当前类的注解信息
         *             registry  注册类
         *@Author dinghy
         *@Date 2019/12/1 14:59
         */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean redBean = registry.containsBeanDefinition("com.dhy.demo.entity.Red");
        boolean blueBean = registry.containsBeanDefinition("com.dhy.demo.entity.Blue");
        if(redBean&&blueBean){
            // 指定bean类型
            BeanDefinition beanDefinition=new RootBeanDefinition(RainBow.class);
            // 注册bean,指定bean id
            registry.registerBeanDefinition("rainBow",beanDefinition);
        }
    }
}
