package com.example.demo.config;

import com.example.demo.dynamic.DynamicDataSource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @project: springboot-demo
 * @className: DynamicDataSourceConfig
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-15
 */
@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class DynamicDataSourceConfig {
    @Bean("db1")
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.db1")
    public DataSource db1() {
        return DataSourceBuilder.create().build();
    }
    @Bean("db2")
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.db2")
    public DataSource db2() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public DataSource dataSource() {
        Map<Object, Object> dataSourceMap = new HashMap<>(2);
        dataSourceMap.put("db1", db1());
        dataSourceMap.put("db2", db2());

        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        dynamicDataSource.setTargetDataSources(dataSourceMap);
        dynamicDataSource.setDefaultTargetDataSource(db1());
        return dynamicDataSource;
    }
}
