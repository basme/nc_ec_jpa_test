package com.netcracker.ec.jpa.test.entity.related;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
@Data
public class RelatedOne {

    @Id
    private UUID id;

    @OneToOne
    private RelatedTwo relatedTwo;

    @ManyToOne
    @JoinColumn
    private RelatedThree relatedThree;

    @OneToMany(mappedBy = "relatedOne", cascade = CascadeType.ALL)
    private Collection<RelatedFour> relatedFours;

    @OneToMany(mappedBy = "relatedOne", cascade = CascadeType.ALL)
    private Collection<RelatedFive> relatedFives;

}
