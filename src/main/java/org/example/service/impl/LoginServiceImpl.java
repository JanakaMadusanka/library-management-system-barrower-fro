package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.LoginDto;
import org.example.entity.LoginEntity;
import org.example.repository.LoginRepository;
import org.example.service.LoginService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class LoginServiceImpl implements LoginService {
    final LoginRepository repository;
    final ModelMapper mapper;
    @Override
    public void insertLoginData(LoginDto loginDto) {
        repository.save(mapper.map(loginDto, LoginEntity.class));
    }
    @Override
    public Boolean validateLogin(LoginDto loginDto) {
        //log.info(loginDto.toString());
        return repository.existsByEmailAndPassword(loginDto.getEmail(), loginDto.getPassword());
    }
}
