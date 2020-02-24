package com.netcracker.ec.jpa.test.entity.related;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.UUID;

@Entity
@Data
public class RelatedFour {

    @Id
    private UUID id;

    private String payload;

    @ManyToOne
    private RelatedOne relatedOne;

}
