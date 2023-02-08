package com.fishlog.kalalogi_back.domain.species;


import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeciesService {

    @Resource
    private SpeciesRepository speciesRepository;

    public List<Species> getAllSpecies() {
        List<Species> species = speciesRepository.findAll();
        return species;
    }

    public Species findSpecies(Integer speciesId) {
        Species species = speciesRepository.findById(speciesId).get();
        return species;
    }

}
