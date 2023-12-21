package com.example.annotation.config;

import com.example.annotation.bean.ConditionBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @project: springboot-demo
 * @className: ConditionConfig
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-13
 */
@Configuration
@Conditional(MyCondition.class)
public class ConditionConfig {
    @Bean
    public ConditionBean conditionBean() {
        return new ConditionBean();
    }
}
