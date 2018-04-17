package com.pmo.dashboard.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OfflineOper {
    private String id;

    private String eHr;

    private String staffName;

    private String employeeId;

    private Date createDate;

    private Date createUpdate;

    private String csSubdeptId;

    private String rmId;

    private String rmName;

    private String operatorId;

    private String month;

    private String year;

    private BigDecimal chsoftiMskHours;

    private BigDecimal chsoftiAwHours;

    private BigDecimal chsoftiIwHours;

    private BigDecimal chsoftiOtHours;

    private BigDecimal chsoftiToHours;

    private BigDecimal chsoftiApwHours;

    private BigDecimal chsoftiIfaw;

    private BigDecimal chsoftiInvalid;

    private BigDecimal chsoftiInfOt;

    private BigDecimal chsoftiInfPt;

    private BigDecimal chsoftiInfAd;

    private BigDecimal chsoftiInfTravel;

    private BigDecimal chsoftiInfEquipment;

    private BigDecimal chsoftiInfSub;

    private BigDecimal chsoftiInfTotal;

    private BigDecimal chsoftiInfCurrent;

    private BigDecimal chsoftiEffectiveNr;

    private BigDecimal chsoftiEffectiveSt;

    private BigDecimal chsoftiInvalidSt;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String geteHr() {
        return eHr;
    }

    public void seteHr(String eHr) {
        this.eHr = eHr == null ? null : eHr.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateUpdate() {
        return createUpdate;
    }

    public void setCreateUpdate(Date createUpdate) {
        this.createUpdate = createUpdate;
    }

    public String getCsSubdeptId() {
        return csSubdeptId;
    }

    public void setCsSubdeptId(String csSubdeptId) {
        this.csSubdeptId = csSubdeptId == null ? null : csSubdeptId.trim();
    }

    public String getRmId() {
        return rmId;
    }

    public void setRmId(String rmId) {
        this.rmId = rmId == null ? null : rmId.trim();
    }

    public String getRmName() {
        return rmName;
    }

    public void setRmName(String rmName) {
        this.rmName = rmName == null ? null : rmName.trim();
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
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

    public BigDecimal getChsoftiMskHours() {
        return chsoftiMskHours;
    }

    public void setChsoftiMskHours(BigDecimal chsoftiMskHours) {
        this.chsoftiMskHours = chsoftiMskHours;
    }

    public BigDecimal getChsoftiAwHours() {
        return chsoftiAwHours;
    }

    public void setChsoftiAwHours(BigDecimal chsoftiAwHours) {
        this.chsoftiAwHours = chsoftiAwHours;
    }

    public BigDecimal getChsoftiIwHours() {
        return chsoftiIwHours;
    }

    public void setChsoftiIwHours(BigDecimal chsoftiIwHours) {
        this.chsoftiIwHours = chsoftiIwHours;
    }

    public BigDecimal getChsoftiOtHours() {
        return chsoftiOtHours;
    }

    public void setChsoftiOtHours(BigDecimal chsoftiOtHours) {
        this.chsoftiOtHours = chsoftiOtHours;
    }

    public BigDecimal getChsoftiToHours() {
        return chsoftiToHours;
    }

    public void setChsoftiToHours(BigDecimal chsoftiToHours) {
        this.chsoftiToHours = chsoftiToHours;
    }

    public BigDecimal getChsoftiApwHours() {
        return chsoftiApwHours;
    }

    public void setChsoftiApwHours(BigDecimal chsoftiApwHours) {
        this.chsoftiApwHours = chsoftiApwHours;
    }

    public BigDecimal getChsoftiIfaw() {
        return chsoftiIfaw;
    }

    public void setChsoftiIfaw(BigDecimal chsoftiIfaw) {
        this.chsoftiIfaw = chsoftiIfaw;
    }

    public BigDecimal getChsoftiInvalid() {
        return chsoftiInvalid;
    }

    public void setChsoftiInvalid(BigDecimal chsoftiInvalid) {
        this.chsoftiInvalid = chsoftiInvalid;
    }

    public BigDecimal getChsoftiInfOt() {
        return chsoftiInfOt;
    }

    public void setChsoftiInfOt(BigDecimal chsoftiInfOt) {
        this.chsoftiInfOt = chsoftiInfOt;
    }

    public BigDecimal getChsoftiInfPt() {
        return chsoftiInfPt;
    }

    public void setChsoftiInfPt(BigDecimal chsoftiInfPt) {
        this.chsoftiInfPt = chsoftiInfPt;
    }

    public BigDecimal getChsoftiInfAd() {
        return chsoftiInfAd;
    }

    public void setChsoftiInfAd(BigDecimal chsoftiInfAd) {
        this.chsoftiInfAd = chsoftiInfAd;
    }

    public BigDecimal getChsoftiInfTravel() {
        return chsoftiInfTravel;
    }

    public void setChsoftiInfTravel(BigDecimal chsoftiInfTravel) {
        this.chsoftiInfTravel = chsoftiInfTravel;
    }

    public BigDecimal getChsoftiInfEquipment() {
        return chsoftiInfEquipment;
    }

    public void setChsoftiInfEquipment(BigDecimal chsoftiInfEquipment) {
        this.chsoftiInfEquipment = chsoftiInfEquipment;
    }

    public BigDecimal getChsoftiInfSub() {
        return chsoftiInfSub;
    }

    public void setChsoftiInfSub(BigDecimal chsoftiInfSub) {
        this.chsoftiInfSub = chsoftiInfSub;
    }

    public BigDecimal getChsoftiInfTotal() {
        return chsoftiInfTotal;
    }

    public void setChsoftiInfTotal(BigDecimal chsoftiInfTotal) {
        this.chsoftiInfTotal = chsoftiInfTotal;
    }

    public BigDecimal getChsoftiInfCurrent() {
        return chsoftiInfCurrent;
    }

    public void setChsoftiInfCurrent(BigDecimal chsoftiInfCurrent) {
        this.chsoftiInfCurrent = chsoftiInfCurrent;
    }

    public BigDecimal getChsoftiEffectiveNr() {
        return chsoftiEffectiveNr;
    }

    public void setChsoftiEffectiveNr(BigDecimal chsoftiEffectiveNr) {
        this.chsoftiEffectiveNr = chsoftiEffectiveNr;
    }

    public BigDecimal getChsoftiEffectiveSt() {
        return chsoftiEffectiveSt;
    }

    public void setChsoftiEffectiveSt(BigDecimal chsoftiEffectiveSt) {
        this.chsoftiEffectiveSt = chsoftiEffectiveSt;
    }

    public BigDecimal getChsoftiInvalidSt() {
        return chsoftiInvalidSt;
    }

    public void setChsoftiInvalidSt(BigDecimal chsoftiInvalidSt) {
        this.chsoftiInvalidSt = chsoftiInvalidSt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}