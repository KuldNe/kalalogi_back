package com.fishlog.kalalogi_back.fishlog.fish;


import lombok.Data;

@Data
public class FishViewDto {
   private Integer fishId;
   private String speciesName;
   private Integer length;
   private Integer weight;
   private String date;
   private String locationName;
   private Boolean released;
   private Boolean isPublic;
   private String comment;
   private String userName;
   private String picture;

};
