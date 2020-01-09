package com.dhy.demo;

import com.dhy.demo.entity.Blue;
import com.dhy.demo.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dinghy
 * @date 2020/1/9 15:32
 */
public class TestExt {
    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        Blue bean = annotationConfigApplicationContext.getBean(Blue.class);
        annotationConfigApplicationContext.close();
    }
}
