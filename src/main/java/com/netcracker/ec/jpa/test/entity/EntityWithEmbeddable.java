package com.netcracker.ec.jpa.test.entity;

import com.netcracker.ec.jpa.test.entity.embeddables.Square;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class EntityWithEmbeddable {

    @Id
    private UUID id;

    private String payload;

    @Embedded
    private Square square;

}
