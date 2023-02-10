package com.fishlog.kalalogi_back.fishlog.fish;


import com.fishlog.kalalogi_back.domain.waterbody.WaterbodyRepository;
import com.fishlog.kalalogi_back.fishlog.catches.CatchDto;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/fish")
    @Operation(summary = "Find all caught fish details from the database", description = "This is used to display fish caught")
    public List<FishDto> getAllFIsh() {

        return fishLogService.getAllFish();
    }

    @PostMapping("/catch")
    @Operation(summary = "Add new catch to DB", description = "")
    public void addCatch(@RequestBody CatchDto catchDto) {
        fishLogService.addCatch(catchDto);
    }

}


