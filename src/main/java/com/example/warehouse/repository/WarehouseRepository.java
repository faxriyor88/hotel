package com.example.hotel.repository;


import com.example.hotel.custom.WarehouseCustom;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse",excerptProjection = WarehouseCustom.class)
public interface WarehouseRepository {
}
