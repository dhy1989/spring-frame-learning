package com.dhy.demo.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author dinghy
 * @date 2020/1/9 15:20
 * <P>
 *     BeanFactoryPostProcessor 用于所有Bean的信息已经被BeanFactory加载,但是还没有创建Bean
 * </P>
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory.getBeanDefinitionCount());
    }
}
