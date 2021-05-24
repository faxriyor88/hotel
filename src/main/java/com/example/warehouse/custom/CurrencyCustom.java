package com.example.hotel.custom;

import com.example.hotel.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CurrencyCustom {
    Integer getId();
    String getName();
    boolean getActive();
}
