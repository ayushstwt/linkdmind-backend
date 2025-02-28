package com.ayshriv.linkmindbackend.service.impl;

import com.ayshriv.linkmindbackend.repository.UserRepository;
import com.ayshriv.linkmindbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
}
