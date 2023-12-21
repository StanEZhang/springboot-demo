package com.example.annotation.config;

import com.example.annotation.pojo.Rectangle;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @project: springboot-demo
 * @className: MyImportBeanDefinitionRegistrar
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-13
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Rectangle.class);
        // 注册一个名字叫做 rectangle 的 bean
        registry.registerBeanDefinition("rectangle", rootBeanDefinition);
    }
}
