package com.example.springbootmultidatasource.db02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Db02Config {

    public static final String DB02_TRANSACTION_MANAGER_NAME = "db02TransactionManager";

    @Bean
    @ConfigurationProperties(prefix = "db02.datasource")
    public Db02HikariConfig db02HikariConfig() {
        return new Db02HikariConfig();
    }
    
    @Bean
    public Db02DataSource db02DataSource(Db02HikariConfig hikariConfig) {
        return new Db02DataSource(hikariConfig);
    }
    
    @Bean
    @ConfigurationProperties(prefix = "db02.jdbctemplate")
    public Db02JdbcTemplate db02JdbcTemplate(Db02DataSource dataSource) {
        return new Db02JdbcTemplate(dataSource);
    }

    @Bean(name = DB02_TRANSACTION_MANAGER_NAME)
    public Db02TransactionManager db02TransactionManager(Db02DataSource dataSource) {
        return new Db02TransactionManager(dataSource);
    }
}
