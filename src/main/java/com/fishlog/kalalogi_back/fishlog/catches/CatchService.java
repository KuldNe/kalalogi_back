package com.fishlog.kalalogi_back.fishlog.catches;



import com.fishlog.kalalogi_back.fishlog.location.LocationDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class CatchService {

    @PostMapping("/catches")
    public void addCatch(CatchDto catchDto) {

    }
}

