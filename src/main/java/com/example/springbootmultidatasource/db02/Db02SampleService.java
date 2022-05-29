package com.example.springbootmultidatasource.db02;

import com.example.springbootmultidatasource.Sample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Db02SampleService {

    private final Db02SampleRepository sampleRepository;

    public Db02SampleService(Db02SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    @Db02Transactional(readOnly = true)
    public List<Sample> findAll() {
        List<Sample> sampleList = sampleRepository.findAll();
        return sampleList;
    }
}
