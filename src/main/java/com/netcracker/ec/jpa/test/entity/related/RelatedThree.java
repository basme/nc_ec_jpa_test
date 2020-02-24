package com.netcracker.ec.jpa.test.entity.related;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
@Data
public class RelatedThree {

    @Id
    private UUID id;

    private String payload;

    @OneToMany(mappedBy = "relatedThree")
    private Collection<RelatedOne> relatedOnes;

}
