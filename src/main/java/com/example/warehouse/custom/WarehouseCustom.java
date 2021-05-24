package com.example.hotel.custom;

import com.example.hotel.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface WarehouseCustom {
    Integer getId();
    String getName();
    boolean getActive();
}
