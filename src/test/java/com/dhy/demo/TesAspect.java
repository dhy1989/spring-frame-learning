package com.dhy.demo;

import com.dhy.demo.aop.MathCalculator;
import com.dhy.demo.config.MainConfigAop;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dinghy
 * @date 2019/12/14
 */
public class TesAspect {
    @Test
    public void  testAop(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigAop.class);
        MathCalculator mathCalculator = annotationConfigApplicationContext.getBean(MathCalculator.class);
        mathCalculator.div(5,3);
        annotationConfigApplicationContext.close();
    }
}
