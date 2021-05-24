package com.example.hotel.repository;

import com.example.hotel.custom.InputProductCustom;
import com.example.hotel.entity.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "inputproduct",excerptProjection = InputProductCustom.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
