package com.example.hotel.entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
public class Currency extends Abctract {
    public Currency( String name, boolean active) {
        super(name, active);
    }
}
