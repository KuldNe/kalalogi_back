package com.fishlog.kalalogi_back.fishlog.fish.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.fishlog.kalalogi_back.domain.species.Species} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpeciesDto implements Serializable {
    private Integer speciesId;
    @Size(max = 255)
    private String speciesName;
}