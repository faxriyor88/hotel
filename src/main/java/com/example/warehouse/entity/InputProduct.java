package com.example.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Input input;
    @OneToOne
    private Product product_id;
    private String amount;
    private String price;
    private LocalDate expire_date;

    public InputProduct(Input input, Product product_id, String amount, String price, LocalDate expire_date) {
        this.input = input;
        this.product_id = product_id;
        this.amount = amount;
        this.price = price;
        this.expire_date = expire_date;
    }
}
