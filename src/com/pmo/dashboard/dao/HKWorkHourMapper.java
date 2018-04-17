package com.pmo.dashboard.dao;

import com.pmo.dashboard.entity.HKWorkHour;

public interface HKWorkHourMapper {
    int deleteByPrimaryKey(String id);

    int insert(HKWorkHour record);

    int insertSelective(HKWorkHour record);

    HKWorkHour selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HKWorkHour record);

    int updateByPrimaryKey(HKWorkHour record);
}