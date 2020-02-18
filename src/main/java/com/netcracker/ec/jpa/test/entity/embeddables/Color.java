package com.netcracker.ec.jpa.test.entity.embeddables;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Color {

    private int r;
    private int g;
    private int b;

}
