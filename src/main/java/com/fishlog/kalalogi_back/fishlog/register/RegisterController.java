package com.fishlog.kalalogi_back.fishlog.register;


import com.fishlog.kalalogi_back.fishlog.login.LoginResponseDTO;
import com.fishlog.kalalogi_back.fishlog.login.LoginService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Resource
    private RegisterService registerService;

    @Resource
    private LoginService loginService;

    @PostMapping("/register")
    @Operation (summary = "Registers new user", description = "Adds new user information to database")

    public LoginResponseDTO addUser(@RequestBody RegisterDto registerDto) {
        registerService.addUser(registerDto);

        return loginService.login(registerDto.getUsername(), registerDto.getPassword());
    }

}
