package com.example.hotel.repository;


import com.example.hotel.custom.MeasurementCustom;
import com.example.hotel.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurment",excerptProjection = MeasurementCustom.class)
public interface MeasurmentRepository extends JpaRepository<Measurement,Integer> {
}
