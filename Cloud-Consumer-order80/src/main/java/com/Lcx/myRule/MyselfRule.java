package com.Lcx.myRule;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyselfRule {
    @Bean
    public com.netflix.loadbalancer.IRule myRule() {
        return new RandomRule();
    }
}
