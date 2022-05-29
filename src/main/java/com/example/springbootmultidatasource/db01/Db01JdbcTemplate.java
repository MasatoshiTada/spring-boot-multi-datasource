package com.example.springbootmultidatasource.db01;

import org.springframework.jdbc.core.JdbcTemplate;

public class Db01JdbcTemplate extends JdbcTemplate {

    public Db01JdbcTemplate(Db01DataSource dataSource) {
        super(dataSource);
    }
}
