package com.chjcfcaloc2020.auth_template.service;

import com.chjcfcaloc2020.auth_template.dto.request.UserCreateRequest;
import com.chjcfcaloc2020.auth_template.dto.response.UserCreateResponse;
import com.chjcfcaloc2020.auth_template.model.User;
import com.chjcfcaloc2020.auth_template.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserCreateResponse createUser(UserCreateRequest request) {
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("Username already exists!");
        }

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();
        userRepository.save(user);

        return UserCreateResponse.builder()
                .username(user.getUsername())
                .build();
    }
}
