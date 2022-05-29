package com.example.springbootmultidatasource.db01;

import com.example.springbootmultidatasource.Sample;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Db01SampleRepository {

    private static final String SQL_FIND_ALL = """
            SELECT id, content FROM sample01 ORDER BY id
            """;

    private static final RowMapper<Sample> ROW_MAPPER = new DataClassRowMapper<>(Sample.class);

    private final Db01JdbcTemplate jdbcTemplate;

    public Db01SampleRepository(Db01JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Sample> findAll() {
        List<Sample> sampleList = jdbcTemplate.query(SQL_FIND_ALL, ROW_MAPPER);
        return sampleList;
    }
}
