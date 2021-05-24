package com.example.hotel.custom;

import com.example.hotel.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface ClientCustom {
    Integer getId();
    String getName();
    String getPhone_number();
}
