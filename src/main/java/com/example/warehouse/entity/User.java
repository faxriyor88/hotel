package com.example.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "foydalanuvchi")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String first_name;
    private String last_name;
    @Column(nullable = false,unique = true)
    private String phone_number;
    @Column(nullable = false,unique = true)
    private String code;
    @Column(nullable = false,unique = true)
    private String password;
    private boolean active;
    @OneToMany
    private List<Warehouse> warehouses;

    public User(String first_name, String last_name, String phone_number,
                String code, String password, boolean active, List<Warehouse> warehouses) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.code = code;
        this.password = password;
        this.active = active;
        this.warehouses = warehouses;
    }
}
