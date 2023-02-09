package com.fishlog.kalalogi_back.validation;


import com.fishlog.kalalogi_back.domain.user.User;
import com.fishlog.kalalogi_back.infrastructure.exception.DataNotFoundException;

import java.util.Optional;

import static com.fishlog.kalalogi_back.validation.ErrorMessage.INCORRECT_CREDENTIALS;

public class Validator {
    public static User getValidUser(Optional<User> optionalUser) {
        if (optionalUser.isEmpty()) {
            throw new DataNotFoundException(INCORRECT_CREDENTIALS.getMessage(), INCORRECT_CREDENTIALS.getCode());
        }
        return optionalUser.get();
    }

}
