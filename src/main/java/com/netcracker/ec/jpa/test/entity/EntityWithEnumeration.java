package com.netcracker.ec.jpa.test.entity;

import com.netcracker.ec.jpa.test.entity.enums.State;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class EntityWithEnumeration {

    @Id
    private UUID id;

    private State state;

}
