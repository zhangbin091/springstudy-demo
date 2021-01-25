package com.riant.aware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname BeanConfig
 * @Description TODO
 * @Date 2021/1/25 23:48
 * @Created by 张斌
 */
@Configuration
public class BeanConfig {
    @Bean
    public TestBean testBean() {
        return new TestBean("testbean");
    }

    @Bean
    public ResourceAwareService resourceAwareService() {
        return new ResourceAwareService();
    }


}
