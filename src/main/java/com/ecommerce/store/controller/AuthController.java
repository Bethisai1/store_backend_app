package com.ecommerce.store.controller;

import com.ecommerce.store.dto.LoginRequest;
import com.ecommerce.store.dto.SignupRequest;
import com.ecommerce.store.model.User;
import com.ecommerce.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.store.dto.ApiResponse;
import com.ecommerce.store.dto.LoginRequest;
import com.ecommerce.store.dto.SignupRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ApiResponse register(@RequestBody SignupRequest request) {

        try {
            User user = userService.registerUser(request);

            user.setPassword(null); // hide password

            return new ApiResponse(
                    true,
                    "User registered successfully",
                    user
            );

        } catch (Exception e) {
            return new ApiResponse(
                    false,
                    e.getMessage(),
                    null
            );
        }
    }
    @PostMapping("/login")
    public ApiResponse login(@RequestBody LoginRequest request) {

        try {
            User user = userService.loginUser(request);

            user.setPassword(null); // hide password

            return new ApiResponse(
                    true,
                    "Login successful",
                    user
            );

        } catch (Exception e) {
            return new ApiResponse(
                    false,
                    e.getMessage(),
                    null
            );
        }
    }
}