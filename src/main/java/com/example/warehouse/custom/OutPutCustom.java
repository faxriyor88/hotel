package com.example.hotel.custom;


import com.example.hotel.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(types = OutPut.class)
public interface OutPutCustom {
    Integer getId();

    LocalDate getDate();

    Warehouse getWarehouse();

    Currency getCurrency();

    String getFacture_number();

    String getCode();

    Client getClient();
}
