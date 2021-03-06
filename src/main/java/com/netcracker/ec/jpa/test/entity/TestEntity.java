package com.netcracker.ec.jpa.test.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class TestEntity {

    @Id
    @GeneratedValue
    private UUID id;

    private String payload;

}
