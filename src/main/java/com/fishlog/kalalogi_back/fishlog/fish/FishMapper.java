package com.fishlog.kalalogi_back.fishlog.fish;

import com.fishlog.kalalogi_back.domain.fish.Fish;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface FishMapper {

    @Mapping(source = "species.name", target = "speciesName")
    @Mapping(source = "acatch.date", target = "date")
    @Mapping(source = "acatch.waterbody.name", target = "locationName")
    @Mapping(source = "acatch.user.username", target = "userName")
    FishDto toDto(Fish fish);

    List<FishDto> toDtos(List<Fish> fishies);



}