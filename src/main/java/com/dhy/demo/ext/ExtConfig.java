package com.dhy.demo.ext;

import com.dhy.demo.entity.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author dinghy
 * @date 2020/1/9 15:31
 */
@Configuration
@ComponentScan("com.dhy.demo.ext")
public class ExtConfig {
    @Bean
    public Blue blue(){
        return new Blue();
    }
}
