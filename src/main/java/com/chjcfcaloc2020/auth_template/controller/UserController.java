package com.chjcfcaloc2020.auth_template.controller;

import com.chjcfcaloc2020.auth_template.dto.request.UserCreateRequest;
import com.chjcfcaloc2020.auth_template.dto.response.UserCreateResponse;
import com.chjcfcaloc2020.auth_template.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public UserCreateResponse createUser(@RequestBody UserCreateRequest request) {
        return  userService.createUser(request);
    }
}
