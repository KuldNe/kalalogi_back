package com.fishlog.kalalogi_back.fishlog.login;

import com.fishlog.kalalogi_back.domain.user.User;
import com.fishlog.kalalogi_back.domain.user.UserMapper;
import com.fishlog.kalalogi_back.domain.user.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;

    public LoginResponseDTO login(String username, String password) {
        User user = userService.findUser(username, password);
        return userMapper.toDto(user);
    }
}
