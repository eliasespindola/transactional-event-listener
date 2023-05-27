package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.domain.AbstractAggregateRoot;

@Entity
@Data
public class Test extends AbstractAggregateRoot<Test> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Test(String name) {
        this.name = name;
    }

    @PrePersist
    public void register(){
        registerEvent(this);
    }
}
