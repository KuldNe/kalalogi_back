package com.fishlog.kalalogi_back.fishlog.fish;


import com.fishlog.kalalogi_back.fishlog.catches.CatchDto;
import com.fishlog.kalalogi_back.fishlog.catches.CatchViewDto;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

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
    public List<FishViewDto> getAllFIsh() {

        return fishLogService.getAllFish();
    }

    @GetMapping ("/catches")
    @Operation (summary = "Get user catches from database", description = "blabla")
    public List <CatchViewDto> getUserCatches (@RequestParam Integer userId) {
        return fishLogService.getUserCatches(userId);

    }

    @GetMapping( "/catch")
    @Operation(summary = "Get one catch info by catch Id", description = "Get one catch info for adding a fish to the catch")
    public CatchViewDto getCatch(@RequestParam Integer catchId) {
        return fishLogService.getCatch(catchId);
    }


    @PostMapping("/catch")
    @Operation (summary = "Add new catch to database", description = "????")
    public void addCatch(@RequestBody CatchDto catchDto){
        fishLogService.addCatch(catchDto);
    }

    @PostMapping("/fish")
    @Operation (summary = "Add caught fish details to database", description = "???")
        public void addFish(@RequestBody FishDto fishDto) {
        fishLogService.addFish(fishDto);
    }

}


