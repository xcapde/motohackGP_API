package com.MotoHack_GP.MotoHack_GP.services;

import com.MotoHack_GP.MotoHack_GP.models.User;
import com.MotoHack_GP.MotoHack_GP.repositories.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService{
    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }
}
