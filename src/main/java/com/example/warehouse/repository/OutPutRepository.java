package com.example.hotel.repository;

import com.example.hotel.custom.OutPutCustom;
import com.example.hotel.entity.OutPut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output",excerptProjection = OutPutCustom.class)
public interface OutPutRepository extends JpaRepository<OutPut,Integer> {
}
