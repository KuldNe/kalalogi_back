package com.fishlog.kalalogi_back.fishlog.catches;

import com.fishlog.kalalogi_back.domain.catches.Acatch;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AcatchMapper {

    Acatch toEntity(CatchDto catchDto);

}