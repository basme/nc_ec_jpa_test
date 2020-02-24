package com.netcracker.ec.jpa.test.service.repo;

import com.netcracker.ec.jpa.test.entity.related.RelatedOne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RelatedOneRepo extends JpaRepository<RelatedOne, UUID> {
}
