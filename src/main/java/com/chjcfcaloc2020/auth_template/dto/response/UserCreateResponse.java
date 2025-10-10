package com.chjcfcaloc2020.auth_template.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCreateResponse {
    private String username;
}
