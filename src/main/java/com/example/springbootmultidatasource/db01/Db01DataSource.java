package com.example.springbootmultidatasource.db01;

import com.zaxxer.hikari.HikariDataSource;

public class Db01DataSource extends HikariDataSource {

    public Db01DataSource(Db01HikariConfig hikariConfig) {
        super(hikariConfig);
    }
}
