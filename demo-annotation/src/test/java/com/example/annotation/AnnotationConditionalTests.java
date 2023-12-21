package com.example.annotation;

import com.example.annotation.bean.ConditionBean;
import com.example.annotation.config.ConditionConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class AnnotationConditionalTests {

    @Test
    void contextLoads() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ConditionBean conditionBean = context.getBean(ConditionBean.class);
        conditionBean.sayHi();
    }
}
