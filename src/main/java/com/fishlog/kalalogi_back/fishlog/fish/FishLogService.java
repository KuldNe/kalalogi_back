package com.fishlog.kalalogi_back.fishlog.fish;

import com.fishlog.kalalogi_back.domain.species.Species;
import com.fishlog.kalalogi_back.domain.species.SpeciesMapper;
import com.fishlog.kalalogi_back.domain.species.SpeciesService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FishLogService {
    @Resource
    private SpeciesService speciesService;

    @Resource
    private SpeciesMapper speciesMapper;


    public List<SpeciesDto> getAllSpecies() {
        List<Species> species = speciesService.findAllSpecies();
        return speciesMapper.toDtos(species);
    }
}
