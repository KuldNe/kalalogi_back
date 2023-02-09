package com.fishlog.kalalogi_back.domain.location;

import com.fishlog.kalalogi_back.fishlog.fish.LocationDto;
import com.fishlog.kalalogi_back.fishlog.fish.SpeciesDto;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import javax.xml.stream.Location;
import java.util.List;

@Service

public class LocationService {
    @Resource
    private LocationRepository locationRepository;

    @Resource
    private LocationMapper locationMapper;


    public List<LocationDto> getAllLocations() {
//        List<Location> locations = locationRepository.findAll();
//        return locationMapper.toDtos(locations);
        return null;
    }

}





