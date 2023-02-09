package com.fishlog.kalalogi_back.fishlog.fish;


import com.fishlog.kalalogi_back.domain.waterbody.WaterbodyRepository;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FishLogController {

    @Resource
    private FishLogService fishLogService;

    @GetMapping("/fish/species")
    @Operation(summary = "Find all species from the database", description = "This is used for the species dropdown")
    public List<SpeciesDto>  getAllSpecies() {
        return fishLogService.getAllSpecies();
    }

/*    @PostMapping("/catches")
    @Operation(summary = "Add date connected to current catch", description = "Adds date of catch to database")
    public void addDate(@RequestBody DateDto dateDto) {

    }*/



}


