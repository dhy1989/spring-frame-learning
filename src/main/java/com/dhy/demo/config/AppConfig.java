package com.dhy.demo.config;

import com.dhy.demo.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dinghy
 * @date 2019/11/26 11:55
 */
@Configuration
public class AppConfig {
    @Bean
    public Person person() {
        return new Person("李四", 18);
    }
}
