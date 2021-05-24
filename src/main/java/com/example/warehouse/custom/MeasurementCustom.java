package com.example.hotel.custom;

import com.example.hotel.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface MeasurementCustom {
    Integer getId();
    String getName();
    boolean getActive();
}
