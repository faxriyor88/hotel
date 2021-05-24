package com.example.hotel.custom;

import com.example.hotel.entity.Input;
import com.example.hotel.entity.InputProduct;
import com.example.hotel.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(types = InputProduct.class)
public interface InputProductCustom {
    Integer getId();

    Product getProduct_id();

    String getAmount();

    String getPrice();

    LocalDate getExpire_date();

    Input getInput();
}