package com.ecommerce.store.service;

import com.ecommerce.store.dto.SignupRequest;
import com.ecommerce.store.dto.LoginRequest;
import com.ecommerce.store.model.User;

public interface UserService {

    User registerUser(SignupRequest request);

    User loginUser(LoginRequest request);
}