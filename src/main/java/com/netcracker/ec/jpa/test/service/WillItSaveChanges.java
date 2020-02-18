package com.netcracker.ec.jpa.test.service;

import com.netcracker.ec.jpa.test.entity.TestEntity;
import com.netcracker.ec.jpa.test.service.repo.TestEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WillItSaveChanges {

    private final TestEntityRepo repo;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void test() {
        Optional<TestEntity> found = repo.findById(UUID.fromString("a48786ef-2df4-4c86-ba67-2d808b3a9976"));
        found.ifPresent(present -> present.setPayload("New payload"));
    }

}
