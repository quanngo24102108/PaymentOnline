package com.hotel.payment.service;

import com.hotel.payment.dto.UserDTO;
import com.hotel.payment.mapper.UserMapper;
import com.hotel.payment.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired(required = false)
    private UserMapper userMapper;

    public List<UserDTO> getUser(){
        return userDao.findAll().stream().map(e -> userMapper.toDto(e)).collect(Collectors.toList());
    }
}
