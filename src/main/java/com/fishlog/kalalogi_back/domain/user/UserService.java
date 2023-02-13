package com.fishlog.kalalogi_back.domain.user;


import com.fishlog.kalalogi_back.fishlog.Status;
import com.fishlog.kalalogi_back.validation.Validator;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;


    public User findUser(String username, String password) {
        Optional<User> optionalUser = userRepository.findUser(username, password, Status.ACTIVE);
        return Validator.getValidUser(optionalUser);
    }

    public User findUserById(Integer userId) {
        return userRepository.findById(userId).get();
    }
}
