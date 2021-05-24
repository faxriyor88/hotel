package com.example.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class Measurement extends Abctract {
    public Measurement(String name, boolean active) {
        super(name, active);
    }
}
