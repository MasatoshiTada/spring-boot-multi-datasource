package com.example.springbootmultidatasource.db02;

import org.springframework.jdbc.core.JdbcTemplate;

public class Db02JdbcTemplate extends JdbcTemplate {

    public Db02JdbcTemplate(Db02DataSource dataSource) {
        super(dataSource);
    }
}
