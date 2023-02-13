package com.fishlog.kalalogi_back.fishlog.register;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    private RegisterService registerService;

    @PostMapping("/register")
    @Operation (summary = "Registers new user", description = "Adds new user information to database")

    public void addUser(@RequestBody RegisterDto registerDto) {
        registerService.addUser(registerDto);

    }




}
