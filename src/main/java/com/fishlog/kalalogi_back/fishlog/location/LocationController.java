package com.fishlog.kalalogi_back.fishlog.location;

import com.fishlog.kalalogi_back.domain.user.UserService;
import com.fishlog.kalalogi_back.domain.waterbody.WaterbodyRepository;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.Location;
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



}
