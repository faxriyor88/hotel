package com.example.hotel.custom;

import com.example.hotel.entity.Attachment;
import com.example.hotel.entity.Category;
import com.example.hotel.entity.Measurement;
import com.example.hotel.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface ProductCustom {
    Integer getId();
    String getName();
    Category getCategory();
    Attachment getPhoto_id();
    String getCode();
    Measurement getMeasurement();
    boolean getActive();
}
