package com.fishlog.kalalogi_back.fishlog.catches;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link com.fishlog.kalalogi_back.domain.catches.Catch} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatchDto implements Serializable {
    private Integer catchId;
    @NotNull
    private LocalDate date;
    private Integer waterbodyId;
    @Size(max = 255)
    @NotNull
    private String waterbodyName;
}