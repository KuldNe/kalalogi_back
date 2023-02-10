package com.fishlog.kalalogi_back.fishlog.fish;

import com.fishlog.kalalogi_back.domain.catches.Acatch;
import com.fishlog.kalalogi_back.domain.catches.AcatchService;
import com.fishlog.kalalogi_back.domain.fish.Fish;
import com.fishlog.kalalogi_back.domain.fish.FishService;
import com.fishlog.kalalogi_back.domain.species.Species;
import com.fishlog.kalalogi_back.domain.species.SpeciesMapper;
import com.fishlog.kalalogi_back.domain.species.SpeciesService;
import com.fishlog.kalalogi_back.domain.user.User;
import com.fishlog.kalalogi_back.domain.user.UserService;
import com.fishlog.kalalogi_back.domain.waterbody.Waterbody;
import com.fishlog.kalalogi_back.domain.waterbody.WaterbodyService;
import com.fishlog.kalalogi_back.fishlog.catches.AcatchMapper;
import com.fishlog.kalalogi_back.fishlog.catches.CatchDto;
import jakarta.annotation.Resource;
import org.mapstruct.control.MappingControl;
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

    @Resource
    private AcatchMapper acatchMapper;

    @Resource
    private UserService userService;

    @Resource
    private WaterbodyService waterbodyService;

    @Resource
    private AcatchService acatchService;


    public List<SpeciesDto> getAllSpecies() {
        List<Species> species = speciesService.findAllSpecies();
        return speciesMapper.toDtos(species);
    }

    public List<FishDto> getAllFish() {
        List<Fish> fishies = fishService.getAllFish();
        return fishMapper.toDtos(fishies);
    }



    public void addCatch(CatchDto catchDto) {
        Acatch acatch = acatchMapper.toEntity(catchDto);

      User user = userService.findUserById(catchDto.getUserId());
      acatch.setUser(user);

      Waterbody waterbody = waterbodyService.findWaterbodyId(catchDto.getWaterbodyId());

      acatch.setWaterbody(waterbody);

      acatchService.saveAcatch(acatch);



    }
}
