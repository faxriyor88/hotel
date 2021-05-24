package com.example.hotel.repository;

import com.example.hotel.custom.CurrencyCustom;
import com.example.hotel.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency",excerptProjection = CurrencyCustom.class)
public  interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}
