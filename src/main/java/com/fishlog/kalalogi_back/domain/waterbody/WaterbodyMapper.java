package com.fishlog.kalalogi_back.domain.waterbody;

import com.fishlog.kalalogi_back.domain.waterbody.Waterbody;
import com.fishlog.kalalogi_back.fishlog.location.LocationDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface WaterbodyMapper {

    @Mapping(source = "id", target = "locationId")
    @Mapping(source = "name", target = "locationName")
    @Mapping(source = "latitude", target = "latitude")
    @Mapping(source = "longitude", target = "longitude")
    LocationDto toDto(Waterbody waterbody);

    List<LocationDto> toDtos(List<Waterbody> waterbodies);
}