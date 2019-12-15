package com.dhy.demo.aop;

import org.aspectj.lang.JoinPoint;
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
    public void pointCut(){

    }

    @Before("pointCut()")
    public void logStart(){
        System.out.println("之前...........");
    }
    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println("之后......"+joinPoint.getSignature().getName());
    }
    @AfterThrowing(value = "pointCut()",throwing ="exception" )
    public  void logExecption(Exception exception){
        System.out.println("异常........"+exception);
    }
    @AfterReturning(value = "pointCut()",returning = "object")
    public void logReturn(Object object){
        System.out.println("返回结果......."+object);
    }
//    @Around("pointCut()")
//    public void logAround(){
//        System.out.println("环绕............");
//    }
}
