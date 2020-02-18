package com.netcracker.ec.jpa.test.service.repo;

import com.netcracker.ec.jpa.test.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TestEntityRepo extends JpaRepository<TestEntity, UUID> {
}
