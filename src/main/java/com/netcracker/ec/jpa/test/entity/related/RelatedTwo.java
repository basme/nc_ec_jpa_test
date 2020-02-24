package com.netcracker.ec.jpa.test.entity.related;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
@Data
public class RelatedTwo {

    @Id
    private UUID id;

    @OneToOne
    private RelatedOne relatedOne;

}
