package com.fishlog.kalalogi_back.fishlog.login;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Resource
    private LoginService loginService;

    @GetMapping("/login")
    @Operation(summary = "This service enables user to login", description = "Application checks user credentials throws error when incorrect provided")
    public LoginResponseDTO login(@RequestParam String username, @RequestParam String password) {

        return loginService.login(username, password);
    }


}
