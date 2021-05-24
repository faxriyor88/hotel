package com.example.hotel.repository;


import com.example.hotel.custom.UserCustom;
import com.example.hotel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user",excerptProjection = UserCustom.class)
public interface UserRepository extends JpaRepository<User,Integer> {
}
