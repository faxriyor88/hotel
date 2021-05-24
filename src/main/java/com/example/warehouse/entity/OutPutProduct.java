package com.example.hotel.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OutPutProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Product product_id;
    private String amount;
    private String price;
    @ManyToOne
    private OutPut outPut;

    public OutPutProduct(Product product_id, String amount, String price, OutPut outPut) {
        this.product_id = product_id;
        this.amount = amount;
        this.price = price;
        this.outPut = outPut;
    }
}
