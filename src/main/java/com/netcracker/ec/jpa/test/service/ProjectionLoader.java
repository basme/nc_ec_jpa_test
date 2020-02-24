package com.netcracker.ec.jpa.test.service;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

@Service
public class ProjectionLoader {

    @PersistenceContext
    private EntityManager entityManager;

    public Collection<?> load() {
        Query query = entityManager.createQuery("select e.id, e.payload, e.count from VerboseEntity e");
        return query.getResultList();
    }

}
