package com.example.springbootmultidatasource.db02;

import com.zaxxer.hikari.HikariDataSource;

public class Db02DataSource extends HikariDataSource {

    public Db02DataSource(Db02HikariConfig configuration) {
        super(configuration);
    }
}
