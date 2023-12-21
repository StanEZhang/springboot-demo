package com.example.demo.dynamic;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @project: springboot-demo
 * @className: DynamicDataSource
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-15
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSource();
    }
}
