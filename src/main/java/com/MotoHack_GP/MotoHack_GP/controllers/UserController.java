package com.MotoHack_GP.MotoHack_GP.controllers;

import com.MotoHack_GP.MotoHack_GP.models.User;
import com.MotoHack_GP.MotoHack_GP.services.IUserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    private IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    User getById(@PathVariable Long id){
        return userService.findById(id);
    }
}
