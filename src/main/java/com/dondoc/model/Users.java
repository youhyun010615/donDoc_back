package com.dondoc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private Long id;  // Pk
    private String userId;
    private String userPassword;
    private String name;
    private Integer age;
    private Integer current_pig_level;
    private Integer currentHouseLevel;
    private Long MonthlyIncome;
    private Integer targetExpenseRatio; //목표 지출 비용
    private String createdAt;



}
