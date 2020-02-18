package com.netcracker.ec.jpa.test.entity.embeddables;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Data
public class Square {

    private int width;
    private int height;

    @Embedded
    private Color color;

}
