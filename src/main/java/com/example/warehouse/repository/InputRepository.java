package com.example.hotel.repository;

import com.example.hotel.custom.InputCustom;
import com.example.hotel.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "input",excerptProjection = InputCustom.class)
public interface InputRepository extends JpaRepository<Input,Integer> {
}
