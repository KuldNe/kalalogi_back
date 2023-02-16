package com.fishlog.kalalogi_back.fishlog.login;

import lombok.Data;

@Data
public class LoginResponseDTO {
    private Integer userId;
    private String userName;
    private String roleType;
}
