package com.dondoc.service;


import com.dondoc.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    private static Long usersIdCounter = 3L;

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
        if (userId.equals("songtan")) {
            return new Users(1L, "songtan", "1234", "송탄", 26, 5, 3, 3000000L, 25, "2026-04-07");
        } else if (userId.equals("minhos")) {
            return new Users(2L, "minhos", "1234", "민호", 24, 7, 4, 4000000L, 30, "2026-04-08");
        }
        throw new IllegalArgumentException("사용자를 찾을 수 없습니다: " + userId);
    }

    @Override
    public Users createUser(Users users) {
        users.setId(usersIdCounter++);
        users.setCurrentPigLevel(5);
        users.setCurrentHouseLevel(1);
        users.setCreatedAt("2026-04-22");
        return users;
    }

    @Override
    public Users updateUser(Long id, Users users) {
        if (id == 1L) {
            return new Users(1L, users.getUserId(), users.getUserPassword(), users.getName(), users.getAge(),
                    users.getCurrentPigLevel(), users.getCurrentHouseLevel(), users.getMonthlyIncome(),
                    users.getTargetExpenseRatio(), "2026-04-07");
        } else if (id == 2L) {
            return new Users(2L, users.getUserId(), users.getUserPassword(), users.getName(), users.getAge(),
                    users.getCurrentPigLevel(), users.getCurrentHouseLevel(), users.getMonthlyIncome(),
                    users.getTargetExpenseRatio(), "2026-04-08");
        }
        throw new IllegalArgumentException("사용자를 찾을 수 없습니다: " + id);
    }

    @Override
    public void deleteUser(Long id) {
        if (id != 1L && id != 2L) {
            throw new IllegalArgumentException("사용자를 찾을 수 없습니다: " + id);
        }
    }
}
