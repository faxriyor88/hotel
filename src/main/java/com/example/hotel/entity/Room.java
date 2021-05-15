package com.example.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String number;
    @Column(nullable = false)
    private String floor;
    @Column(nullable = false)
    private String size;
    @ManyToMany
    private List<Hotel> hotels;

    public Room(String number, String floor, String size, List<Hotel> hotels) {
        this.number = number;
        this.floor = floor;
        this.size = size;
        this.hotels = hotels;
    }
}
