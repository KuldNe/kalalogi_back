package com.fishlog.kalalogi_back.fishlog.catches;

import lombok.Data;

@Data
public class CatchDto {

        private String date;
        private Integer userId;
        private Integer waterbodyId;

}
