package com.dondoc.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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

    public Long getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getCurrent_pig_level() {
        return current_pig_level;
    }

    public Integer getCurrentHouseLevel() {
        return currentHouseLevel;
    }

    public Long getMonthlyIncome() {
        return MonthlyIncome;
    }

    public Integer getTargetExpenseRatio() {
        return targetExpenseRatio;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCurrent_pig_level(Integer current_pig_level) {
        this.current_pig_level = current_pig_level;
    }

    public void setCurrentHouseLevel(Integer currentHouseLevel) {
        this.currentHouseLevel = currentHouseLevel;
    }

    public void setMonthlyIncome(Long monthlyIncome) {
        MonthlyIncome = monthlyIncome;
    }

    public void setTargetExpenseRatio(Integer targetExpenseRatio) {
        this.targetExpenseRatio = targetExpenseRatio;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}

