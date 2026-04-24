package com.dondoc.service;

import com.dondoc.model.Records;

import java.util.List;

public interface RecordsService {
    List<Records> getAllRecords();
    List<Records> getRecordsByUserId(Long UserId);
    Records getRecordsById(Long id);
    Records createRecords(Records records);
    Records updateRecords(Long id, Records records);
    void deleteRecords(Long id);
}
