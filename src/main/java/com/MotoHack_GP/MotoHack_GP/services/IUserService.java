package com.MotoHack_GP.MotoHack_GP.services;

import com.MotoHack_GP.MotoHack_GP.models.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();
    User findById(Long id);
}
