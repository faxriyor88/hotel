package com.example.hotel.dtocarrier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoomCarrier {
    private String number;
    private String floor;
    private String size;
    private Integer hotel_id;

}
