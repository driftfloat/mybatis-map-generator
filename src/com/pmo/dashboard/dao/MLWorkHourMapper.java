package com.pmo.dashboard.dao;

import com.pmo.dashboard.entity.MLWorkHour;

public interface MLWorkHourMapper {
    int deleteByPrimaryKey(String id);

    int insert(MLWorkHour record);

    int insertSelective(MLWorkHour record);

    MLWorkHour selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MLWorkHour record);

    int updateByPrimaryKey(MLWorkHour record);
}