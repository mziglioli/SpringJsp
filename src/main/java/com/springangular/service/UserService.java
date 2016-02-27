package com.springangular.service;

import org.springframework.stereotype.Service;

import com.springangular.model.User;
import com.springangular.repository.UserRepository;

@Service
public class UserService extends ServiceDefault<User, UserRepository> {

    public User findUserByEmail(String email) {
        return getRepository().findUserByEmail(email);
    }

}
