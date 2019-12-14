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
        MathCalculator mathCalculator = (MathCalculator) annotationConfigApplicationContext.getBean("mathCalculator");
        mathCalculator.div(2,1);
        annotationConfigApplicationContext.close();
    }
}
