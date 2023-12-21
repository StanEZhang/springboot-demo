package com.example.annotation.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @project: springboot-demo
 * @className: MyImportSelector
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-13
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.example.annotation.pojo.Triangle"};
    }
}
