package com.fishlog.kalalogi_back.domain.catches;

import com.fishlog.kalalogi_back.fishlog.Status;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcatchService {

    @Resource
    private AcatchRepository acatchRepository;

    public void saveAcatch(Acatch acatch) {
        acatchRepository.save(acatch);
    }

    public Acatch findByCatchId(Integer acatchId) {
        return acatchRepository.findById(acatchId).get();
    }

    public List<Acatch> findCatchesByUser(Integer userId) {
        return acatchRepository.findCatchesByUser(userId, Status.ACTIVE);
    }
}
