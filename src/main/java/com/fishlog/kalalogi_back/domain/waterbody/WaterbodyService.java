package com.fishlog.kalalogi_back.domain.waterbody;

import com.fishlog.kalalogi_back.domain.species.Species;
import com.fishlog.kalalogi_back.fishlog.Status;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterbodyService {
    @Resource
    private WaterbodyRepository waterbodyRepository;

    public List<Waterbody> findAllWaterbodies() {
        return waterbodyRepository.findWaterbodies(Status.ACTIVE);
    }

    public Waterbody findWaterbodyId(Integer waterbodyId) {
        return waterbodyRepository.findById(waterbodyId).get();
    }

    public void saveWaterbody(Waterbody waterbody) {
        waterbodyRepository.save(waterbody);
    }


}
