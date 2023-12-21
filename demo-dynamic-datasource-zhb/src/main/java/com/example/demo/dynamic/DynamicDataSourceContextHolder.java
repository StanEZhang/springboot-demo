package com.example.demo.dynamic;

/**
 * @project: springboot-demo
 * @className: DynamicDataSourceContextHolder
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-15
 */
public class DynamicDataSourceContextHolder {
    public static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static String getDataSource() {
        return CONTEXT_HOLDER.get();
    }

    public static void setDataSource(String dataSource) {
        CONTEXT_HOLDER.set(dataSource);
    }

    public static void clearDataSource() {
        CONTEXT_HOLDER.remove();
    }
}
