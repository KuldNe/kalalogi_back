package com.fishlog.kalalogi_back.domain.user;

import com.fishlog.kalalogi_back.domain.user.User;
import com.fishlog.kalalogi_back.fishlog.login.LoginResponseDTO;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {
    User toEntity(LoginResponseDTO loginResponseDTO);


    @Mapping(source = "id", target = "userId")
    @Mapping(source = "role.name", target = "roleType")
    LoginResponseDTO toDto(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(LoginResponseDTO loginResponseDTO, @MappingTarget User user);
}