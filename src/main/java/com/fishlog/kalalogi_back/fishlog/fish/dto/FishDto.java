package com.fishlog.kalalogi_back.fishlog.fish.dto;

import lombok.Data;

@Data
public class FishDto {
    private String date;
    private Integer catchId;
    private Integer speciesId;
    private Integer length;
    private Integer weight;
    private String comment;
    private Boolean released;
    private Boolean isPublic;
    private String picture;

}
