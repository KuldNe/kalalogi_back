package com.fishlog.kalalogi_back.domain.user;

import com.fishlog.kalalogi_back.fishlog.Status;
import com.fishlog.kalalogi_back.fishlog.login.LoginResponseDTO;
import com.fishlog.kalalogi_back.fishlog.register.RegisterDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {


//    User toEntity(LoginResponseDTO loginResponseDTO);

    @Mapping(source = "id", target = "userId")
    @Mapping(source = "role.name", target = "roleType")
    LoginResponseDTO toDto(User user);


    @Mapping(source = "username", target = "username")
    @Mapping(source = "email", target = "EMail")
    @Mapping(source = "password", target = "password")
    @Mapping(constant = Status.ACTIVE, target = "status")
    User registerEntity(RegisterDto registerDto);



    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(LoginResponseDTO loginResponseDTO, @MappingTarget User user);


}