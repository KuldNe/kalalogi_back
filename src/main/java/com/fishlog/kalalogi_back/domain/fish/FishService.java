package com.fishlog.kalalogi_back.domain.fish;

import com.fishlog.kalalogi_back.fishlog.Status;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FishService {
    @Resource
    private FishRepository fishRepository;


    public List<Fish> getAllFish() {
        return fishRepository.findPublicFish(true, Status.ACTIVE, Status.ACTIVE, Status.ACTIVE);
    }


    public void saveFish(Fish fish) {
        fishRepository.save(fish);
    }

    public Fish findFish(Integer fishId) {
        return fishRepository.findById(fishId).get();
    }
}
