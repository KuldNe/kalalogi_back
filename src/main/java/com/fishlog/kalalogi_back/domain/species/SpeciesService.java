package com.fishlog.kalalogi_back.domain.species;


import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeciesService {

    @Resource
    private SpeciesRepository speciesRepository;


    public List<Species> findAllSpecies() {
        return speciesRepository.findAll();
    }

    public Species findBySpeciesId(Integer speciesId) {
        return speciesRepository.findById(speciesId).get();
    }
}
