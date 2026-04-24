package com.dondoc.service;

import com.dondoc.model.Users;
import java.util.List;

public interface UsersService {
    List<Users> getAllUsers();
    Users getUserById(Long id);
    Users getUserByUserId(String userId);
    Users createUser(Users users);
    Users updateUser(Long id, Users users);
    void deleteUser(Long id);
}
