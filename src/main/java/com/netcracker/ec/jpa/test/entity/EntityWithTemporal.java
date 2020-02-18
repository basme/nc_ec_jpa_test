package com.netcracker.ec.jpa.test.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class EntityWithTemporal {

    @Id
    private UUID id;

    private Date date;

}
