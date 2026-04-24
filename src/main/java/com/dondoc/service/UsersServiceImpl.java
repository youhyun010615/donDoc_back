package com.dondoc.service;


import com.dondoc.model.Users;

import java.util.List;

public class UsersServiceImpl implements UsersService {
    @Override
    public List<Users> getAllUsers() {
        return List.of(
                new Users(1L, "songtan", "1234", "송탄", 26, 5, 3, 3000000L, 25, "2026-04-07"),
                new Users(2L, "minhos", "1234", "민호", 24, 7, 4, 4000000L, 30, "2026-04-08")
        );
    }

    @Override
    public Users getUserById(Long id) {
        if (id == 1L) {
            return new Users(1L, "songtan", "1234", "송탄", 26, 5, 3, 3000000L, 25, "2026-04-07");
        }else if(id == 2L){
                return new Users(2L, "minhos", "1234", "민호", 24, 7, 4, 4000000L, 30, "2026-04-08");
        }
        throw new IllegalArgumentException("사용자를 찾을 수 없습니다: " + id);
    }

    @Override
    public Users getUserByUserId(String userId) {
        return null;
    }

    @Override
    public Users createUser(Users users) {
        return null;
    }

    @Override
    public Users updateUser(Long id, Users users) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
