package com.dhy.demo.aop;

import org.aspectj.lang.annotation.*;

/**
 * @author dinghy
 * @date 2019/12/14
 * 切面类
 */
@Aspect
public class LogAspects {

    /**
     *@Description 抽取公共的切入点表达式
     *@Author dinghy
     *@Date 2019/12/14 18:00
     */
    @Pointcut("execution(public int com.dhy.demo.aop.MathCalculator.*(..))")
    public int pointCut(){
        return 1;
    }

    @Before("pointCut()")
    public void logStart(){
        System.out.println("之前...........");
    }
    @After("pointCut()")
    public void logEnd(){
        System.out.println("之后......");
    }
    @AfterThrowing("pointCut()")
    public  void logExecption(){
        System.out.println("异常........");
    }
    @AfterReturning("pointCut()")
    public void logReturn(){
        System.out.println("返回结果.......");
    }
//    @Around("pointCut()")
//    public void logAround(){
//        System.out.println("环绕............");
//    }
}
