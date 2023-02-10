package com.fishlog.kalalogi_back.domain.catches;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class AcatchService {

    @Resource
    private AcatchRepository acatchRepository;

    public void saveAcatch(Acatch acatch) {
        acatchRepository.save(acatch);
    }

}
