package com.example.demo.dto;

import com.example.demo.entity.Test;
import lombok.Data;

@Data
public class TestDTO {
    private String name;

    public Test toEntity(){
        return new Test(name);
    }
}
