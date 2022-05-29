package com.example.springbootmultidatasource.db01;

import com.example.springbootmultidatasource.Sample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Db01SampleService {

    private final Db01SampleRepository sampleRepository;

    public Db01SampleService(Db01SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    @Db01Transactional(readOnly = true)
    public List<Sample> findAll() {
        List<Sample> sampleList = sampleRepository.findAll();
        return sampleList;
    }
}
