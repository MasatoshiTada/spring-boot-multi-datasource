package com.example.springbootmultidatasource;

import com.example.springbootmultidatasource.db01.Db01SampleService;
import com.example.springbootmultidatasource.db02.Db02SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
public class SampleRestController {

    private final Db01SampleService db01SampleService;
    private final Db02SampleService db02SampleService;

    public SampleRestController(Db01SampleService db01SampleService, Db02SampleService db02SampleService) {
        this.db01SampleService = db01SampleService;
        this.db02SampleService = db02SampleService;
    }

    @GetMapping("/")
    public List<Sample> findAll() {
        List<Sample> sampleList01 = db01SampleService.findAll();
        List<Sample> sampleList02 = db02SampleService.findAll();
        return Stream.concat(sampleList01.stream(), sampleList02.stream()).toList();
    }
}
