package com.netcracker.ec.jpa.test.service;

import com.netcracker.ec.jpa.test.entity.VerboseEntity;
import com.netcracker.ec.jpa.test.service.repo.VerboseEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VerboseSearcher {

    private final VerboseEntityRepo verboseEntityRepo;

    public void search() {
        verboseEntityRepo.findAllByCountGreaterThan(1000);
        verboseEntityRepo.findAllByCountGreaterThan(1000);
        verboseEntityRepo.findAllByCountGreaterThan(1000);
        verboseEntityRepo.findAllByCountGreaterThan(2000);
        verboseEntityRepo.findAllByCountGreaterThan(3000);
    }

}
