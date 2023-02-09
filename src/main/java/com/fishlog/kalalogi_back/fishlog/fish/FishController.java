package com.fishlog.kalalogi_back.fishlog.fish;


import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@Resource
public class FishController {
}

    @GetMapping("/catchlocations")
    @Operation(summary = "Finds all catch locations from system/database", description = "This information is used in frontend to create catch locations dropdown")
    public List<CityDto> getAllCities() {
        List<CityDto> cities = atmService.getAllCities();
        return cities;
    }