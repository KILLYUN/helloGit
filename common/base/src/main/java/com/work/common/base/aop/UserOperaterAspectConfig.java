package com.work.common.base.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * UserOperaterAspectConfig
 * 将UserOperaterAspect注册到Spring容器中
 * @author wmy
 * @date 2023/4/14 14:59
 */
@Configuration
public class UserOperaterAspectConfig {

    @Bean
    public UserOperaterAspect userOperaterAspect(){
        return new UserOperaterAspect();
    }
}
