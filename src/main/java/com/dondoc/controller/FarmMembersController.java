package com.dondoc.controller;

import com.dondoc.model.FarmMembers;
import com.dondoc.service.FarmMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farmsMembers")
public class FarmsMembersController {

    @Autowired
    private FarmMembersService farmMembersService;

    @GetMapping
    public List<FarmMembers> getAllFarmMembers(){
        return farmMembersService.getAllFarmMembers();
    }

    @GetMapping("/{id}")
    public FarmMembers getFarmMembersById(@PathVariable Long id){
        return farmMembersService.getFarmMembersById(id);
    }

    @GetMapping("/user/{userId}")
    public List<FarmMembers> getFarmMembersByUserId(@PathVariable Long userId){
        return farmMembersService.getFarmMembersByUserId(userId);
    }

    @GetMapping("/farm/{farmId}")
    public List<FarmMembers> getFarmMembersByFarmId(@PathVariable Long farmId){
        return farmMembersService.getFarmMembersByFarmId(farmId);
    }

    @PostMapping("/join")
    public FarmMembers joinfarmMembers(@RequestParam Long userId, Long farmId){
        return farmMembersService.joinFarmMembers(userId, farmId);
    }

    @DeleteMapping("{id}")
    public void leaveFarmMembers(@PathVariable Long id){
        farmMembersService.leaveFarmMembers(id);
    }

}
