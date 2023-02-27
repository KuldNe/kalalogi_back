package com.fishlog.kalalogi_back.validation;


import lombok.Getter;

@Getter
public enum ErrorMessage {
    INCORRECT_CREDENTIALS("Vale kasutajanimi või parool", "666"),
    USER_EXISTS("Kasutajanimi on juba kasutusel", "409"),
    NO_ATM_LOCATIONS("Selles asukohas ei leidu veel ühtki pangaautomaati", "555")
    ;
//    , DUPLICATE_LOCATION_NAME

    private String message;
    private String code;

    ErrorMessage(String message, String code) {
        this.message = message;
        this.code = code;
    }

}
