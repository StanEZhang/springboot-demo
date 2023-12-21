package com.example.demo.aspect;

import com.example.demo.annotation.DS;
import com.example.demo.dynamic.DynamicDataSourceContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @project: springboot-demo
 * @className: DynamicDataSourceAspect
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-15
 */
@Component
@Aspect
@Slf4j
public class DynamicDataSourceAspect {

    @Pointcut("@annotation(com.example.demo.annotation.DS)")
    public void dynamicDataSourcePointCut() {

    }

    @Around("dynamicDataSourcePointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("切面生效");
        String dataSourceKey = "db1";
        // 类上的注解
        Class<?> aClass = joinPoint.getTarget().getClass();
        DS annotation = aClass.getAnnotation(DS.class);

        // 方法上的注解
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        DS annotationMethod = signature.getMethod().getAnnotation(DS.class);

        if (Objects.nonNull(annotationMethod)) {
            dataSourceKey = annotationMethod.value();
        } else {
            dataSourceKey = annotation.value();
        }
        // 设置数据源
        DynamicDataSourceContextHolder.setDataSource(dataSourceKey);
        log.info("数据源为"+dataSourceKey);
        try {
             return joinPoint.proceed();
        }finally {
            DynamicDataSourceContextHolder.clearDataSource();
        }
    }
}
