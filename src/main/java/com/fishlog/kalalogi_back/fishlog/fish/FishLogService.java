package com.fishlog.kalalogi_back.fishlog.fish;

import com.fishlog.kalalogi_back.domain.catches.Acatch;
import com.fishlog.kalalogi_back.domain.catches.AcatchService;
import com.fishlog.kalalogi_back.domain.fish.Fish;
import com.fishlog.kalalogi_back.domain.fish.FishMapper;
import com.fishlog.kalalogi_back.domain.fish.FishService;
import com.fishlog.kalalogi_back.domain.species.Species;
import com.fishlog.kalalogi_back.domain.species.SpeciesMapper;
import com.fishlog.kalalogi_back.domain.species.SpeciesService;
import com.fishlog.kalalogi_back.domain.user.User;
import com.fishlog.kalalogi_back.domain.user.UserService;
import com.fishlog.kalalogi_back.domain.waterbody.Waterbody;
import com.fishlog.kalalogi_back.domain.waterbody.WaterbodyService;
import com.fishlog.kalalogi_back.domain.catches.AcatchMapper;
import com.fishlog.kalalogi_back.fishlog.catches.CatchDto;
import com.fishlog.kalalogi_back.fishlog.catches.CatchViewDto;
import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;
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

    public List<FishViewDto> getAllFish() {
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

    public void addFish(FishDto fishDto) {
        Fish fish = fishMapper.toEntity(fishDto);

        Acatch acatch = acatchService.findByCatchId(fishDto.getCatchId());
        fish.setAcatch(acatch);

        Species species = speciesService.findBySpeciesId(fishDto.getSpeciesId());
        fish.setSpecies(species);

        fishService.saveFish(fish);

    }

    public List<CatchViewDto> getUserCatches(Integer userId) {
        List<Acatch> catches = acatchService.findCatchesByUser(userId);

    return acatchMapper.toDtos(catches);
    }

    public CatchViewDto getCatch(Integer catchId) {
        Acatch acatch = acatchService.findByCatchId(catchId);

        return acatchMapper.toDto(acatch);
    }


    public Fish findFish(Integer fishId) {
        return fishRepository.findById(fishId);
        fishMapper.updateFish(fish);
    }
}



}
