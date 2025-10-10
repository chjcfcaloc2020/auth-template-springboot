package com.chjcfcaloc2020.auth_template.controller;

import com.chjcfcaloc2020.auth_template.dto.request.LoginRequest;
import com.chjcfcaloc2020.auth_template.dto.response.LoginResponse;
import com.chjcfcaloc2020.auth_template.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return authenticationService.login(request);
    }
}
