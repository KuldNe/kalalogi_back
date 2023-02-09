package com.fishlog.kalalogi_back.domain.species;


import com.fishlog.kalalogi_back.fishlog.fish.SpeciesDto;
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
}
