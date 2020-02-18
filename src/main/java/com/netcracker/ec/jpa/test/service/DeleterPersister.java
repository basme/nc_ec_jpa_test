package com.netcracker.ec.jpa.test.service;

import com.netcracker.ec.jpa.test.entity.TestEntity;
import com.netcracker.ec.jpa.test.service.repo.TestEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DeleterPersister {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void deletePersist() {
        TestEntity found = entityManager.find(TestEntity.class, UUID.fromString("057d3af4-0874-4d19-99d1-b541a89054c3"));
        entityManager.remove(found);
        entityManager.persist(found);
    }
}
