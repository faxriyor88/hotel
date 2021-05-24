package com.example.hotel.custom;

import com.example.hotel.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface AttachmentCustom {
    Integer getId();
    String getName();
    Integer getSize();
    String getContent_type();
}
