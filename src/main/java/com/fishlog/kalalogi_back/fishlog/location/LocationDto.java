package com.fishlog.kalalogi_back.fishlog.location;


import lombok.Data;

@Data
public class LocationDto {

   private Integer locationId;
   private String locationName;
   private Float latitude;
   private Float longitude;
}
