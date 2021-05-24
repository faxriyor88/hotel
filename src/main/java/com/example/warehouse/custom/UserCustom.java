package com.example.hotel.custom;

import com.example.hotel.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface UserCustom {
    Integer getId();
    String getFirst_name();
    String getLast_name();
    String getPhone_number();
    String getCode();
    String getPassword();
    boolean getActive();

}
