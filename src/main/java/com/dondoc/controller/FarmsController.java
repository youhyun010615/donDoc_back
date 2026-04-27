package com.dondoc.controller;

import com.dondoc.model.Farms;
import com.dondoc.service.FarmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farms")
public class FarmsController {

    @Autowired
    private FarmsService farmsService;

    @GetMapping
    public List<Farms> getAllFarms(){
        return farmsService.getAllFarms();
    }

    @GetMapping("/{id}")
    public Farms getFarmsById(@PathVariable Long id){
        return farmsService.getFarmsById(id);
    }

    @PostMapping
    public Farms createFamrs(@RequestBody Farms farms){
        return farmsService.createFarms(farms);
    }

    @PutMapping("/{id}")
    public Farms updateFarms(@PathVariable Long id, @RequestBody Farms farms){
        return farmsService.updateFarms(id, farms);
    }

    @DeleteMapping("{id}")
    public void deleteFarms(@PathVariable Long id){
        farmsService.deleteFarms(id);
    }
}
