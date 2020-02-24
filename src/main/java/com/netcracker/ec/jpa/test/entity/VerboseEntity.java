package com.netcracker.ec.jpa.test.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
public class VerboseEntity {

    @Id
    private UUID id;

    private String payload;
    private int count;
    private BigDecimal rate;
    private String goatOnABoat;

}
