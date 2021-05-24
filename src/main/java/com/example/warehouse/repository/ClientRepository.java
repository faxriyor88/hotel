package com.example.hotel.repository;

import com.example.hotel.custom.ClientCustom;

import com.example.hotel.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client",excerptProjection = ClientCustom.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
