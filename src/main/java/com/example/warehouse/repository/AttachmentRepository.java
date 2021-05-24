package com.example.hotel.repository;

import com.example.hotel.custom.AttachmentCustom;
import com.example.hotel.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "attachment",excerptProjection = AttachmentCustom.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
