package com.dondoc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyHistory {
    private long id; // PK
    private long userId; // FK -> users.id
    private String targetMonth;
    private Float avgRatio;  // 평균 페이스/비율
    private Integer houseLevel;
}
