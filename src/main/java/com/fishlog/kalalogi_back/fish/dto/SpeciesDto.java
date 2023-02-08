package com.fishlog.kalalogi_back.fish.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SpeciesDto implements Serializable {

    private Integer speciesId;

    @Size(max = 255)
    @NotNull
    private String speciesName;
}
