package com.example.hotel.repository;


import com.example.hotel.custom.OutPutCustom;
import com.example.hotel.custom.OutPutProductCustom;
import com.example.hotel.entity.OutPutProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputproduct",excerptProjection = OutPutProductCustom.class)
public interface OutPutProductRepository extends JpaRepository<OutPutProduct,Integer> {
}
