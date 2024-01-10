package com.example.annotation.config;

import com.example.annotation.pojo.Circle;
import org.springframework.context.annotation.Import;

/**
 * @project: springboot-demo
 * @className: MainConfigTwo
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-13
 */
@Import({Circle.class,MyImportSelector.class})
public class MainConfigTwo {
}
