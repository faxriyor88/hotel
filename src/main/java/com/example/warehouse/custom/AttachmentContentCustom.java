package com.example.hotel.custom;

import com.example.hotel.entity.Attachment;
import com.example.hotel.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentCustom {
    Integer getId();
    byte getBytes();
    Attachment getAttachment();
}
