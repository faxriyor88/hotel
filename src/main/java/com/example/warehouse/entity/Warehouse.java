package com.example.hotel.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class Warehouse extends Abctract {
    public Warehouse(String name, boolean active) {
        super(name, active);
    }
}
