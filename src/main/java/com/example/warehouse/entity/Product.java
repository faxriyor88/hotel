package com.example.hotel.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product extends Abctract {
    @ManyToOne
    private Category category;
    @OneToOne
    private Attachment photo_id;
    @Column(nullable = false,unique = true)
    private String code;
    @ManyToOne
    private Measurement measurement;

    public Product(String name, boolean active, Category category,
                   Attachment photo_id, String code, Measurement measurement) {
        super(name, active);
        this.category = category;
        this.photo_id = photo_id;
        this.code = code;
        this.measurement = measurement;
    }
}
