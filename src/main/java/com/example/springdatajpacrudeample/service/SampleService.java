package com.example.springdatajpacrudeample.service;

import com.example.springdatajpacrudeample.entity.SampleEntity;
import com.example.springdatajpacrudeample.repository.SampleRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

    private final SampleRepo sampleRepo;

    public SampleService(SampleRepo sampleRepo) {
        this.sampleRepo = sampleRepo;
    }

    public SampleEntity save(SampleEntity sampleEntity) {
        return sampleRepo.save(sampleEntity);
    }

    public List<SampleEntity> getAll() {
        return sampleRepo.findAll();
    }

    public SampleEntity findById(Long id) {
        return sampleRepo.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        sampleRepo.deleteById(id);
    }
}
