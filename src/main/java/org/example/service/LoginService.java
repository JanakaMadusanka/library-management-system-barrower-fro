package org.example.service;

import org.example.dto.LoginDto;
public interface LoginService {
    void insertLoginData(LoginDto loginDto);
    Boolean validateLogin(LoginDto loginDto);
}
