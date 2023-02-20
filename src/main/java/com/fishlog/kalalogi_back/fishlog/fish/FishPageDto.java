package com.fishlog.kalalogi_back.fishlog.fish;

import lombok.Data;

import java.util.List;

@Data
public class FishPageDto {
    private Integer totalPages;
    private List<FishViewDto> fishies;
}
