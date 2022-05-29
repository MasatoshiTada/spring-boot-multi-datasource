package com.example.springbootmultidatasource.db01;

import org.springframework.jdbc.support.JdbcTransactionManager;

public class Db01TransactionManager extends JdbcTransactionManager {

    public Db01TransactionManager(Db01DataSource dataSource) {
        super(dataSource);
    }
}
