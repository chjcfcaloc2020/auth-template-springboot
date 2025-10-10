package com.chjcfcaloc2020.auth_template.dto.request;

import lombok.Data;

@Data
public class UserCreateRequest {
    private String username;
    private String password;
}
