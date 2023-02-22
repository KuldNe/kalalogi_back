package com.fishlog.kalalogi_back.domain.species;

import com.fishlog.kalalogi_back.fishlog.fish.dto.SpeciesDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SpeciesMapper {

    @Mapping(source = "id", target = "speciesId")
    @Mapping(source = "name", target = "speciesName")
    SpeciesDto toDto(Species species);

      List<SpeciesDto> toDtos(List <Species> species);

}