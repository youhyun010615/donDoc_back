package com.dondoc.service;


import com.dondoc.model.Records;
import java.util.List;

public class RecordsServiceImpl implements RecordsService {
    private static Long recordsIdCounter = 4L;

    @Override
    public List<Records> getAllRecords() {
        return List.of(
                new Records(1L, 1L, 4L, 15000L, "점심", "음식점", "2026-04-21", "2026-04-21T12:00:00Z"),
                new Records(2L, 1L, 5L, 5000L, "지하철", "교통카드", "2026-04-21", "2026-04-21T09:00:00Z"),
                new Records(3L, 1L, 3L, 50000L, "과외 수당", "부업", "2026-04-20", "2026-04-20T18:00:00Z")
        );
    }

    @Override
    public List<Records> getRecordsByUserId(Long UserId) {
        return List.of(
                new Records(1L, 1L, 4L, 15000L, "점심", "음식점", "2026-04-21", "2026-04-21T12:00:00Z"),
                new Records(2L, 1L, 5L, 5000L, "지하철", "교통카드", "2026-04-21", "2026-04-21T09:00:00Z"),
                new Records(3L, 1L, 3L, 50000L, "과외 수당", "부업", "2026-04-20", "2026-04-20T18:00:00Z")
        );

    }

    @Override
    public Records getRecordsById(Long id) {
        if (id == 1L) {
            return new Records(1L, 1L, 4L, 15000L, "점심", "음식점", "2026-04-21", "2026-04-21T12:00:00Z");
        } else if (id == 2L) {
            return new Records(2L, 1L, 5L, 5000L, "지하철", "교통카드", "2026-04-21", "2026-04-21T09:00:00Z");
        } else if (id == 3L) {
            return new Records(3L, 1L, 3L, 50000L, "과외 수당", "부업", "2026-04-20", "2026-04-20T18:00:00Z");
        } else if (id == 4L) {
            return new Records(4L, 2L, 1L, 20000L, "회사급여", "봉급", "2026-04-21", "2026-04-21T18:00:00Z");
        }
        throw new IllegalArgumentException("거래를 찾을 수 없습니다: " + id);
    }


    @Override
    public Records createRecords(Records records) {
        records.setId(recordsIdCounter++);
        records.setCreatedAt("2026-04-22T12:00:002");
        return records;
    }

    @Override
    public Records updateRecords(Long id, Records records) {
        if (id == 1L) {
            return new Records(1L, records.getUserId(), records.getCategoryId(), records.getAmount(),
                    records.getDescription(), records.getMemo(), records.getRecordData(), "2026-04-21T12:00:00Z");
        } else if (id == 2L) {
            return new Records(2L, records.getUserId(), records.getCategoryId(), records.getAmount(),
                    records.getDescription(), records.getMemo(), records.getRecordData(), "2026-04-21T09:00:00Z");
        } else if (id == 3L) {
            return new Records(3L, records.getUserId(), records.getCategoryId(), records.getAmount(),
                    records.getDescription(), records.getMemo(), records.getRecordData(), "2026-04-20T18:00:00Z");
        } else if (id == 4L) {
            return new Records(4L, records.getUserId(), records.getCategoryId(), records.getAmount(),
                    records.getDescription(), records.getMemo(), records.getRecordData(), "2026-04-21T18:00:00Z");
        }
        throw new IllegalArgumentException("거래를 찾을 수 없습니다: " + id);
    }

    @Override
    public void deleteRecords(Long id) {
        if (id < 1L || id > 4L) {
            throw new IllegalArgumentException("거래를 찾을 수 없습니다: " + id);
        }
    }
}