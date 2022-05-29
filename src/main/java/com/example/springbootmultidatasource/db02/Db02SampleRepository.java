package com.example.springbootmultidatasource.db02;

import com.example.springbootmultidatasource.Sample;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Db02SampleRepository {

    private static final String SQL_FIND_ALL = """
            SELECT id, content FROM sample02 ORDER BY id
            """;

    private static final RowMapper<Sample> ROW_MAPPER = new DataClassRowMapper<>(Sample.class);

    private final Db02JdbcTemplate jdbcTemplate;

    public Db02SampleRepository(Db02JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Sample> findAll() {
        List<Sample> sampleList = jdbcTemplate.query(SQL_FIND_ALL, ROW_MAPPER);
        return sampleList;
    }
}
