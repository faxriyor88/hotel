package com.example.hotel.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class Supplier extends Abctract{
    @Column(nullable = false,unique = true)
    private String phone_number;

    public Supplier(String name, boolean active, String phone_number) {
        super(name, active);
        this.phone_number = phone_number;
    }
}
