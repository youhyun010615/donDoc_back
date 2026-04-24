package com.dondoc.service;

import com.dondoc.model.Farms;

import java.util.List;

public class FarmsServiceImpl implements FarmsService {
    private static long farmsIdCounter = 4L;

    @Override
    public List<Farms> getAllFarms() {
        return List.of(
                new Farms(1L, "KB농장", "2026-04-07"),
                new Farms(2L, "신한농장", "2026-04-08"),
                new Farms(3L, "우리농장", "2026-04-09")
        );
    }

    @Override
    public Farms getFarmsById(Long id) {
        if (id == 1L) {
            return new Farms(1L, "KB농장", "2026-04-07");
        } else if (id == 2L) {
            return new Farms(2L, "신한농장", "2026-04-08");
        } else if (id == 3L) {
            return new Farms(3L, "우리농장", "2026-04-09");
        }
        throw new IllegalArgumentException("농장을 찾을 수 없습니다: " + id);
    }

    @Override
    public Farms createFarms(Farms farms) {
        farms.setId(farmsIdCounter++);
        farms.setCreatedAt("2026-04-22");
        return farms;
    }

    @Override
    public Farms updateFarms(Long id, Farms farms) {
        if (id == 1L) {
            return new Farms(1L, farms.getName(), "2026-04-07");
        } else if (id == 2L) {
            return new Farms(2L, farms.getName(), "2026-04-08");
        } else if (id == 3L) {
            return new Farms(3L, farms.getName(), "2026-04-09");
        }
        throw new IllegalArgumentException("농장을 찾을 수 없습니다: " + id);
    }

    @Override
    public void deleteFarms(Long id) {
        if (id < 1L || id > 3L) {
            throw new IllegalArgumentException("농장을 찾을 수 없습니다: " + id);
        }
    }
}
