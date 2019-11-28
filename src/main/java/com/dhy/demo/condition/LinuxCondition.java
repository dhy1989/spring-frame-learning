package com.dhy.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author dinghy
 * @date 2019/11/27
 */
public class LinuxCondition implements Condition{
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        if(property.contains("Linux")){
            return true;
        }
        return false;
    }
}
