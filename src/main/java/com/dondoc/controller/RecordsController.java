package com.dondoc.controller;

import com.dondoc.model.Records;
import com.dondoc.service.RecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/records")
public class RecordsController {

    @Autowired
    private RecordsService recordsService;

    @GetMapping
    public List<Records> getAllRecords(){
        return recordsService.getAllRecords();
    }

    @GetMapping("/{id}")
    public Records getRecordsById(@PathVariable  Long id){
        return recordsService.getRecordsById(id);
    }

    @GetMapping("/user/{userId}")
    public List<Records> getRecordsByUserId(@PathVariable Long userId){
        return recordsService.getRecordsByUserId(userId);
    }

    @PostMapping
    public Records createRecords(@RequestBody Records records){
        return recordsService.createRecords(records);
    }

    @PutMapping("/{id}")
    public Records updateRecords(@PathVariable Long id, Records records){
        return recordsService.updateRecords(id, records);
    }

    @DeleteMapping("/{id}")
    public void deleteRecords(@PathVariable Long id){
        recordsService.deleteRecords(id);
    }

}
