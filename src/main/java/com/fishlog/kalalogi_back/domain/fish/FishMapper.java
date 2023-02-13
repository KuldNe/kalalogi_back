package com.fishlog.kalalogi_back.domain.fish;

import com.fishlog.kalalogi_back.fishlog.Status;
import com.fishlog.kalalogi_back.fishlog.fish.FishDto;
import com.fishlog.kalalogi_back.fishlog.fish.FishViewDto;
import org.mapstruct.*;
import com.fishlog.kalalogi_back.util.PictureUtil;

import java.nio.charset.StandardCharsets;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", imports =  PictureUtil.class)
public interface FishMapper {

    @Mapping(source = "species.name", target = "speciesName")
    @Mapping(source = "acatch.date", target = "date")
    @Mapping(source = "acatch.waterbody.name", target = "locationName")
    @Mapping(source = "acatch.user.username", target = "userName")
    @Mapping(expression = "java(PictureUtil.byteArrayToString(fish.getPicture()))", target = "picture")
    FishViewDto toDto(Fish fish);


    List<FishViewDto> toDtos(List<Fish> fishies);

    @Mapping(source = "length", target = "length")
    @Mapping(source = "weight", target = "weight")
    @Mapping(source = "released", target = "released")
    @Mapping(source = "comment", target = "comment")
    @Mapping(source = "isPublic", target = "publicField")
    @Mapping(source = "picture", target = "picture", qualifiedByName = "stringToByteArray")
    @Mapping(constant = Status.ACTIVE, target = "status")
    Fish toEntity(FishDto fishDto);

    @Named("stringToByteArray")
    static byte[] stringToByteArray(String picture) {
        if ("".equals(picture)) {
            return null;
        }
        byte[] bytes = picture.getBytes(StandardCharsets.UTF_8);
        return bytes;
    }

}