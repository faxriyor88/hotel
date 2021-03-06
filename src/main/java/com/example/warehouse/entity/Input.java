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
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate date;
    @ManyToOne
    private Warehouse warehouse;
    @ManyToOne
    private Supplier supplier;
    @ManyToOne
    private  Currency currency;
    @Column(nullable = false,unique = true)
    private String facture_number;
    @Column(nullable = false,unique = true)
    private String code;

    public Input(LocalDate date, Warehouse warehouse, Supplier supplier,
                 Currency currency, String facture_number, String code) {
        this.date = date;
        this.warehouse = warehouse;
        this.supplier = supplier;
        this.currency = currency;
        this.facture_number = facture_number;
        this.code = code;
    }
}
