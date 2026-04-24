package com.dondoc.service;

import com.dondoc.model.Farms;

import java.util.List;

public interface FarmsService {
    List<Farms> getAllFarms();
    Farms getFarmsById(Long id);
    Farms createFarms(Farms farms);
    Farms updateFarms(Long id, Farms farms);
    void deleteFarms(Long id);
}
