package com.fishlog.kalalogi_back.fishlog.fish.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.fishlog.kalalogi_back.domain.fish.Fish} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChartFishDto implements Serializable {
//    private Integer speciesId;
    private String speciesName;

    private Long countFish;

}