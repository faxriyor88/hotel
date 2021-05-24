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
public class OutPut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate date;
    @ManyToOne
    private Warehouse warehouse;
    @ManyToOne
    private Currency currency;
    @Column(nullable = false,unique = true)
    private String facture_number;
    @Column(nullable = false,unique = true)
    private String code;
    @ManyToOne
    private Client client;

    public OutPut(LocalDate date, Warehouse warehouse, Currency currency,
                  String facture_number, String code, Client client) {
        this.date = date;
        this.warehouse = warehouse;
        this.currency = currency;
        this.facture_number = facture_number;
        this.code = code;
        this.client = client;
    }
}
