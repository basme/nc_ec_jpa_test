package com.netcracker.ec.jpa.test.service.repo;

import com.netcracker.ec.jpa.test.entity.StrangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StrangeEntityRepo extends JpaRepository<StrangeEntity, UUID> {
}
