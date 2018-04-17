package com.pmo.dashboard.dao;

import com.pmo.dashboard.entity.OfflineOper;

public interface OfflineOperMapper {
    int deleteByPrimaryKey(String id);

    int insert(OfflineOper record);

    int insertSelective(OfflineOper record);

    OfflineOper selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OfflineOper record);

    int updateByPrimaryKeyWithBLOBs(OfflineOper record);

    int updateByPrimaryKey(OfflineOper record);
}