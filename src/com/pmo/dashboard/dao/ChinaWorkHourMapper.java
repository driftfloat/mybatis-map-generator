package com.pmo.dashboard.dao;

import com.pmo.dashboard.entity.ChinaWorkHour;

public interface ChinaWorkHourMapper {
    int deleteByPrimaryKey(String id);

    int insert(ChinaWorkHour record);

    int insertSelective(ChinaWorkHour record);

    ChinaWorkHour selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ChinaWorkHour record);

    int updateByPrimaryKey(ChinaWorkHour record);
}