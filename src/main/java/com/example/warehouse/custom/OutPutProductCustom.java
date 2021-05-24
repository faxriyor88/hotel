package com.example.hotel.custom;

import com.example.hotel.entity.OutPut;
import com.example.hotel.entity.OutPutProduct;
import com.example.hotel.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutPutProduct.class)
public interface OutPutProductCustom {
    Integer getId();
    Product getProduct_id();
    String getAmount();
    String getPrice();
    OutPut getOutPut();
}
