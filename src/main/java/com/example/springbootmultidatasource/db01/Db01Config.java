package com.example.springbootmultidatasource.db01;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Db01Config {

    public static final String DB01_TRANSACTION_MANAGER_NAME = "db01TransactionManager";

    @Bean
    @ConfigurationProperties(prefix = "db01.datasource")
    public Db01HikariConfig db01HikariConfig() {
        return new Db01HikariConfig();
    }

    @Bean
    public Db01DataSource db01DataSource(Db01HikariConfig hikariConfig) {
        return new Db01DataSource(hikariConfig);
    }

    @Bean
    @ConfigurationProperties(prefix = "db01.jdbctemplate")
    public Db01JdbcTemplate db01JdbcTemplate(Db01DataSource dataSource) {
        return new Db01JdbcTemplate(dataSource);
    }

    @Bean(name = DB01_TRANSACTION_MANAGER_NAME)
    public Db01TransactionManager db01TransactionManager(Db01DataSource dataSource) {
        return new Db01TransactionManager(dataSource);
    }
}
