package com.fishlog.kalalogi_back.fishlog.fish;


import com.fishlog.kalalogi_back.domain.location.LocationService;
import com.fishlog.kalalogi_back.domain.species.Species;
import com.fishlog.kalalogi_back.domain.species.SpeciesService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class FishController {

    @Resource
    private SpeciesService speciesService;

    @GetMapping("/fish/species")
    @Operation(summary = "Find all species from the database", description = "This is used for the species dropdown")
    public List<SpeciesDto> getAllSpecies() {
        return speciesService.getAllSpecies();

    }

    @Resource
    private LocationService locationService;

    @GetMapping("/fish/location")
    @Operation(summary = "Find all fish locations from the database", description = "This is used for the location dropdown")
    public List<LocationDto> getAllLocations() {
        return locationService.getAllLocations();
    }

}


