package com.netcracker.ec.jpa.test.service.repo;

import com.netcracker.ec.jpa.test.entity.VerboseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.UUID;

public interface VerboseEntityRepo extends JpaRepository<VerboseEntity, UUID> {

    Collection<VerboseEntity> findAllByCountGreaterThan(int threshold);

}
