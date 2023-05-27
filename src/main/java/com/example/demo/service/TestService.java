package com.example.demo.service;

import com.example.demo.dto.TestDTO;
import com.example.demo.entity.Test;
import com.example.demo.repository.TestRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {
    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Transactional
    public Test createTest(TestDTO testDTO){
        Test test = testDTO.toEntity();
        Test testSaved = testRepository.save(test);
        return testSaved;
    }
}
