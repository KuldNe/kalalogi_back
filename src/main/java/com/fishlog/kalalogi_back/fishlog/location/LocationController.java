package com.fishlog.kalalogi_back.fishlog.location;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    @Resource
    private LocationService locationService;

    @GetMapping("/waterbodies")
    @Operation(summary = "Find all waterbodies from the database", description = "This is used for the waterbodies dropdown")
    public List<LocationDto> getAllLocations() {
        return locationService.getAllLocations();
    }

    @PostMapping ("/waterbodies")
    @Operation (summary = "Add new waterbody to database", description = "?????")
    public void addWaterbody(@RequestBody LocationDto locationDto) {
        locationService.addWaterbody(locationDto);
    }


}
