package com.fishlog.kalalogi_back.fishlog.catches;

import com.fishlog.kalalogi_back.domain.catches.Catch;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CatchMapper {
    @Mapping(source = "waterbodyName", target = "waterbody.name")
    @Mapping(source = "waterbodyId", target = "waterbody.id")
    @Mapping(source = "catchId", target = "id")
    Catch toEntity(CatchDto catchDto);


}