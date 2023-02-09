package com.fishlog.kalalogi_back.domain.location;

import com.fishlog.kalalogi_back.domain.species.Species;
import com.fishlog.kalalogi_back.fishlog.fish.LocationDto;
import com.fishlog.kalalogi_back.fishlog.fish.SpeciesDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import javax.xml.stream.Location;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface LocationMapper {

    @Mapping(source = "id", target = "locationId")
    @Mapping(source = "name", target = "locationName")
    LocationDto toDto(Location location);

    List<LocationDto> toDtos(List <Location> Location);

}
