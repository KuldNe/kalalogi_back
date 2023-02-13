package com.fishlog.kalalogi_back.fishlog.catches;

import lombok.Data;

@Data
public class CatchViewDto {
        private Integer catchId;
        private String catchDate;
        private Integer waterbodyId;
        private String waterbodyName;
        private String latitude;
        private String longitude;
    
}
