package com.spring.demo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
                .driverClassName("oracle.jdbc.driver.OracleDriver")
                .url("jdbc:oracle:thin:@127.0.0.1:1521:orcl")
                .username("HR")
                .password("delhi")
                .build();
    }
}
