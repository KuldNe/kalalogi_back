package com.fishlog.kalalogi_back.fishlog.fish;


import lombok.Data;

@Data
public class FishDto {
   private String speciesName;
   private Integer length;
   private Integer weight;
   private String date;
   private String locationName;
   private boolean released;
   private String comment;
   private String userName;
};
