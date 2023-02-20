package com.fishlog.kalalogi_back.domain.fish;

import com.fishlog.kalalogi_back.fishlog.Status;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FishService {
    @Resource
    private FishRepository fishRepository;


    public Page<Fish> getFish(Integer waterbodyId, Integer speciesId, Pageable pagination) {
        return fishRepository.findPublicFish(true, Status.ACTIVE, Status.ACTIVE, Status.ACTIVE, waterbodyId, speciesId, pagination);
    }

    public List<Fish> getUserFish(Integer userId, Integer waterbodyId, Integer speciesId) {

        return fishRepository.findByUserId(userId,true, Status.ACTIVE, Status.ACTIVE, waterbodyId, speciesId);
    }
    public List<Fish> getCatchFish(Integer catchId, Integer waterbodyId, Integer speciesId) {
        return fishRepository.findByCatchId(catchId, true, Status.ACTIVE, Status.ACTIVE, waterbodyId, speciesId);
    }


    public void saveFish(Fish fish) {
        fishRepository.save(fish);
    }

    public Fish findFish(Integer fishId) {
        return fishRepository.findById(fishId).get();
    }


}
