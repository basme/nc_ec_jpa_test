package com.netcracker.ec.jpa.test.service;

import com.netcracker.ec.jpa.test.entity.related.RelatedFive;
import com.netcracker.ec.jpa.test.service.repo.RelatedOneRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
@Slf4j
public class CycledLoader {

    private final RelatedOneRepo relatedOneRepo;

    public void load() {
        relatedOneRepo.findAll().forEach(one -> {
            Collection<RelatedFive> fives = one.getRelatedFives();
            log.info("{}", fives.size());
        });
    }
}
