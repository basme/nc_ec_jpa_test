package com.netcracker.ec.jpa.test.service.injects;

import lombok.Getter;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class InjectingServiceOne {

    @PersistenceContext
    @Getter
    private EntityManager manager;


}
