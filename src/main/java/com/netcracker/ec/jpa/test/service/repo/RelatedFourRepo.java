package com.netcracker.ec.jpa.test.service.repo;

import com.netcracker.ec.jpa.test.entity.related.RelatedFour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RelatedFourRepo extends JpaRepository<RelatedFour, UUID> {
}
