package com.dondoc.service;

import com.dondoc.model.MonthlyHistory;

import java.util.List;

public class MonthlyHistoryServiceImpl implements MonthlyHistoryService{
    private static Long monthlyHistoryIdCounter = 4L;

    @Override
    public List<MonthlyHistory> getAllMonthlyHistories() {
        return List.of(
                new MonthlyHistory(1L, 1L, "2026-04", 25.5f, 3),
                new MonthlyHistory(2L, 1L, "2026-03", 30.2f, 4),
                new MonthlyHistory(3L, 2L, "2026-04", 28.1f, 3)
        );
    }

    @Override
    public MonthlyHistory getMonthlyHistoryById(Long id) {
        if (id == 1L) {
            return new MonthlyHistory(1L, 1L, "2026-04", 25.5f, 3);
        } else if (id == 2L) {
            return new MonthlyHistory(2L, 1L, "2026-03", 30.2f, 4);
        } else if (id == 3L) {
            return new MonthlyHistory(3L, 2L, "2026-04", 28.1f, 3);
        }
        throw new IllegalArgumentException("월간 히스토리를 찾을 수 없습니다: " + id);
    }

    @Override
    public List<MonthlyHistory> getMonthlyHistoriesByUserId(Long userId) {
        if (userId == 1L) {
            return List.of(
                    new MonthlyHistory(1L, 1L, "2026-04", 25.5f, 3),
                    new MonthlyHistory(2L, 1L, "2026-03", 30.2f, 4)
            );
        } else if (userId == 2L) {
            return List.of(
                    new MonthlyHistory(3L, 2L, "2026-04", 28.1f, 3)
            );
        }
        throw new IllegalArgumentException("해당 사용자의 월간 히스토리를 찾을 수 없습니다: " + userId);
    }

    @Override
    public MonthlyHistory getMonthlyHistoryByUserIdAndMonth(Long userId, String targetMonth) {
        if (userId == 1L && targetMonth.equals("2026-04")) {
            return new MonthlyHistory(1L, 1L, "2026-04", 25.5f, 3);
        } else if (userId == 1L && targetMonth.equals("2026-03")) {
            return new MonthlyHistory(2L, 1L, "2026-03", 30.2f, 4);
        } else if (userId == 2L && targetMonth.equals("2026-04")) {
            return new MonthlyHistory(3L, 2L, "2026-04", 28.1f, 3);
        }
        throw new IllegalArgumentException("월간 히스토리를 찾을 수 없습니다: userId=" + userId + ", month=" + targetMonth);
    }


    @Override
    public MonthlyHistory createMonthlyHistory(MonthlyHistory monthlyHistory) {
        monthlyHistory.setId(monthlyHistoryIdCounter++);
        return monthlyHistory;
    }

    @Override
    public MonthlyHistory updateMonthlyHistory(Long id, MonthlyHistory monthlyHistory) {
        if (id == 1L) {
            return new MonthlyHistory(1L, monthlyHistory.getUserId(), monthlyHistory.getTargetMonth(),
                    monthlyHistory.getAvgRatio(), monthlyHistory.getHouseLevel());
        } else if (id == 2L) {
            return new MonthlyHistory(2L, monthlyHistory.getUserId(), monthlyHistory.getTargetMonth(),
                    monthlyHistory.getAvgRatio(), monthlyHistory.getHouseLevel());
        } else if (id == 3L) {
            return new MonthlyHistory(3L, monthlyHistory.getUserId(), monthlyHistory.getTargetMonth(),
                    monthlyHistory.getAvgRatio(), monthlyHistory.getHouseLevel());
        }
        throw new IllegalArgumentException("월간 히스토리를 찾을 수 없습니다: " + id);
    }
}
