package com.dondoc.controller;

import com.dondoc.model.Users;
import com.dondoc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Long id){
        return usersService.getUserById(id);
    }

    @GetMapping("/{userId}")
    public Users getUserByUserId(@PathVariable String userId){
        return usersService.getUserByUserId(userId);
    }




}

