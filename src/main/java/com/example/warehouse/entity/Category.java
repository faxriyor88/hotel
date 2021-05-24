package com.example.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category extends Abctract{
    @ManyToOne
    private Category parent_category_id;

    public Category(String name, boolean active, Category parent_category_id) {
        super(name, active);
        this.parent_category_id = parent_category_id;
    }
}
