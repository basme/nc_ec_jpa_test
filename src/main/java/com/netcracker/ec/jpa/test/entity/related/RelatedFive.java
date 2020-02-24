package com.netcracker.ec.jpa.test.entity.related;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
@Data
public class RelatedFive {

    @Id
    private UUID id;

    @ManyToOne
    private RelatedOne relatedOne;

}
