package com.example.hotel.repository;

import com.example.hotel.custom.AttachmentContentCustom;
import com.example.hotel.entity.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentcontent",excerptProjection = AttachmentContentCustom.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
}
