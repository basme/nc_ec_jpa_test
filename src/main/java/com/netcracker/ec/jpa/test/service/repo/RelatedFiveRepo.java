package com.netcracker.ec.jpa.test.service.repo;

import com.netcracker.ec.jpa.test.entity.related.RelatedFive;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RelatedFiveRepo extends JpaRepository<RelatedFive, UUID> {
}
