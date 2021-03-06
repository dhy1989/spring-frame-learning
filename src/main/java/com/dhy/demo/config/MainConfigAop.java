package com.dhy.demo.config;

import com.dhy.demo.aop.LogAspects;
import com.dhy.demo.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author dinghy
 * @date 2019/12/14
 * <p>
 * AOP: 原理:动态代理
 *     在程序运行期间动态的将某段代码切入到指定方法的指定位置
 *  1.导入aop模块
 *  2.定义逻辑类MathCaculator,在业务执行的之前,之后,抛异常都打印日志
 *  3.定义日志切面类LogAspects
 *  4.切面通知加上对应注解,注意环绕型切面的返回值不能为 void ，应该为 Object
 *  5.将切面类和业务类注入容器
 *  6.给切面类加上@Aspect标识
 *  7.启动切面功能@EnableAspectJAutoProxy
 *
 *  三步:
 *     1.将业务逻辑组件和切面类都注入到容器中,告诉spring是哪个切面类
 *     2.在切面类上的每一个方法上标注通知注解,告诉spring何时运行(切入点表达式)
 *     3.开启基于注解的aop模式
 *
 *     BeanPostProcessor 在对象创建完成,初始化前后调用
 *     InstantiationAwareBeanPostProcessor  在bean实例之间先尝试用后置处理器返回对象
 * </p>
 */
@EnableAspectJAutoProxy
@Configuration
public class MainConfigAop {

    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }

}
