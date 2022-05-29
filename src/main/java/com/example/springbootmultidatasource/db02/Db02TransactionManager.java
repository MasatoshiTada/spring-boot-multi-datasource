package com.example.springbootmultidatasource.db02;

import org.springframework.jdbc.support.JdbcTransactionManager;

public class Db02TransactionManager extends JdbcTransactionManager {

    public Db02TransactionManager(Db02DataSource dataSource) {
        super(dataSource);
    }
}
