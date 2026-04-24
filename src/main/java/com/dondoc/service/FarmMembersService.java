package com.dondoc.service;

import com.dondoc.model.FarmMembers;

import java.util.List;

public interface FarmMembersService {
    List<FarmMembers> getAllFarmMembers();
    FarmMembers getFarmMembersById(Long id);
    List<FarmMembers> getFarmMembersByUserId(Long userId);
    List<FarmMembers> getFarmMembersByFarmId(Long farmId);
    FarmMembers joinFarmMembers(Long userId, Long farmId);
    void leaveFarmMembers(Long id);
}
