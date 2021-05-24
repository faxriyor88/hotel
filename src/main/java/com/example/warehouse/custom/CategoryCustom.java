package com.example.hotel.custom;

import com.example.hotel.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CategoryCustom {
    Integer getId();
    String getName();
    Category getParent_category_id();
    boolean getActive();
}
