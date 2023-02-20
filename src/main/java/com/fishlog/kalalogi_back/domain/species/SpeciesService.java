package com.fishlog.kalalogi_back.domain.species;


import com.fishlog.kalalogi_back.fishlog.fish.SpeciesDto;
import jakarta.annotation.Resource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpeciesService {

    @Resource
    private SpeciesRepository speciesRepository;


    public List<Species> findAllSpecies() {
        return speciesRepository.findAll(Sort.by("name"));

    }

    public Species findBySpeciesId(Integer speciesId) {
        return speciesRepository.findById(speciesId).get();
    }
}
