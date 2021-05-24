package com.example.hotel.custom;

import com.example.hotel.entity.Currency;
import com.example.hotel.entity.Input;
import com.example.hotel.entity.Supplier;
import com.example.hotel.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(types = Input.class)
public interface InputCustom {
    Integer getId();
    LocalDate getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getFacture_number();
    Integer getCode();

}
