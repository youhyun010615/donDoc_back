package com.dondoc.service;

import com.dondoc.model.MonthlyHistory;

import java.time.Month;
import java.util.List;

public interface MonthlyHistoryService {
    List<MonthlyHistory> getAllMonthlyHistories();
    MonthlyHistory getMonthlyHistoryById(Long id);
    List<MonthlyHistory> getMonthlyHistoriesByUserId(Long userId);
    MonthlyHistory getMonthlyHistoryByUserIdAndMonth(Long userId, String targetMonth);
    MonthlyHistory createMonthlyHistory(MonthlyHistory monthlyHistory);
    MonthlyHistory updateMonthlyHistory(Long id, MonthlyHistory monthlyHistory);
}
