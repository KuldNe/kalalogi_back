package com.fishlog.kalalogi_back.fishlog.fish;

import com.fishlog.kalalogi_back.domain.fish.Fish;
import com.fishlog.kalalogi_back.domain.fish.FishService;
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
    private FishService fishService;
    @Resource
    private SpeciesMapper speciesMapper;
    @Resource
    private FishMapper fishMapper;


    public List<SpeciesDto> getAllSpecies() {
        List<Species> species = speciesService.findAllSpecies();
        return speciesMapper.toDtos(species);
    }

    public List<FishDto> getAllFish() {
        List<Fish> fishies = fishService.getAllFish();
        return fishMapper.toDtos(fishies);
    }
}
