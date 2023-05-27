package com.example.demo.controller;

import com.example.demo.dto.TestDTO;
import com.example.demo.entity.Test;
import com.example.demo.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final TestService testService;

    public DemoController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/create-test")
    public ResponseEntity createTest(@RequestBody TestDTO dto){
        Test test = testService.createTest(dto);
        return ResponseEntity.ok(test);
    }
}
