package com.dondoc.service;

import com.dondoc.model.FarmMembers;

import java.util.List;

public class FarmMembersServiceImpl implements FarmMembersService{
    private static Long farmMemberIdCounter = 4L;

    @Override
    public List<FarmMembers> getAllFarmMembers() {
        return List.of(
                new FarmMembers(1L, 1L, 1L, "2026-04-07"),
                new FarmMembers(2L, 1L, 2L, "2026-04-08"),
                new FarmMembers(3L, 2L, 1L, "2026-04-09")
        );
    }

    @Override
    public FarmMembers getFarmMembersById(Long id) {
        if (id == 1L) {
            return new FarmMembers(1L, 1L, 1L, "2026-04-07");
        } else if (id == 2L) {
            return new FarmMembers(2L, 1L, 2L, "2026-04-08");
        } else if (id == 3L) {
            return new FarmMembers(3L, 2L, 1L, "2026-04-09");
        }
        throw new IllegalArgumentException("농장 멤버를 찾을 수 없습니다: " + id);
    }

    @Override
    public List<FarmMembers> getFarmMembersByUserId(Long userId) {
        if (userId == 1L) {
            return List.of(
                    new FarmMembers(1L, 1L, 1L, "2026-04-07"),
                    new FarmMembers(2L, 1L, 2L, "2026-04-08")
            );
        } else if (userId == 2L) {
            return List.of(
                    new FarmMembers(3L, 2L, 1L, "2026-04-09")
            );
        }
        throw new IllegalArgumentException("해당 사용자의 농장 멤버 정보를 찾을 수 없습니다: " + userId);
    }

    @Override
    public List<FarmMembers> getFarmMembersByFarmId(Long farmId) {
        if (farmId == 1L) {
            return List.of(
                    new FarmMembers(1L, 1L, 1L, "2026-04-07"),
                    new FarmMembers(3L, 2L, 1L, "2026-04-09")
            );
        } else if (farmId == 2L) {
            return List.of(
                    new FarmMembers(2L, 1L, 2L, "2026-04-08")
            );
        }
        throw new IllegalArgumentException("해당 농장의 멤버를 찾을 수 없습니다: " + farmId);

    }

    @Override
    public FarmMembers joinFarmMembers(Long userId, Long farmId) {
        FarmMembers farmMembers = new FarmMembers();
        farmMembers.setId(farmMemberIdCounter++);
        farmMembers.setUserId(userId);
        farmMembers.setFarmId(farmId);
        farmMembers.setJoined_at("2026-04-22");
        return farmMembers;
    }

    @Override
    public void leaveFarmMembers(Long id) {
        if (id < 1L || id > 3L) {
            throw new IllegalArgumentException("농장 멤버를 찾을 수 없습니다: " + id);
        }
    }
}
