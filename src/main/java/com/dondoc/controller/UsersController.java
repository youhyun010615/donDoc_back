package com.dondoc.controller;

import com.dondoc.model.Users;
import com.dondoc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/by/{userId}")
    public Users getUserByUserId(@PathVariable String userId){
        return usersService.getUserByUserId(userId);
    }

    @PostMapping
    public Users createUser(@RequestBody Users users){ //RequestBody는 Json 바디를 객체로 변환하는 어노테이션
        return usersService.createUser(users);
    }

    @PutMapping("/{id}")
    public Users updateUser(@PathVariable Long id, Users users){
        return usersService.updateUser(id, users);
    }

    @DeleteMapping("/{id}")
    public void deleteUsers(@PathVariable Long id){
        usersService.deleteUser(id);
    }



}

