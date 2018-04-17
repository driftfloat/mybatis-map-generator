package com.pmo.dashboard.entity;

import java.math.BigDecimal;

public class ChinaWorkHour {
    private String id;

    private String month;

    private String year;

    private BigDecimal standardWorkday;

    private BigDecimal standardWorkhour;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public BigDecimal getStandardWorkday() {
        return standardWorkday;
    }

    public void setStandardWorkday(BigDecimal standardWorkday) {
        this.standardWorkday = standardWorkday;
    }

    public BigDecimal getStandardWorkhour() {
        return standardWorkhour;
    }

    public void setStandardWorkhour(BigDecimal standardWorkhour) {
        this.standardWorkhour = standardWorkhour;
    }
}