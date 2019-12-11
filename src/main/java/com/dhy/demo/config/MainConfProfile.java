package com.dhy.demo.config;

import com.dhy.demo.entity.Yellow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


/**
 * @author dinghy
 * @date 2019/12/11
 * <p>
 *     通过@Profile指定在不同环境加载的类
 *     -Dspring.profiles.active=dev 通过jvm参数指定profile
 * </p>
 */
@Configuration
@ComponentScan("com.dhy.demo.config")
public class MainConfProfile {

    @Profile("dev")
    @Bean(("devYellow"))
    public Yellow yellow(){
        return new Yellow();
    }

    @Profile("test")
    @Bean("testYellow")
    public Yellow yellow1(){
        return new Yellow();
    }

    @Profile("pro")
    @Bean("proYellow")
    public Yellow yellow2(){
        return new Yellow();
    }
}
