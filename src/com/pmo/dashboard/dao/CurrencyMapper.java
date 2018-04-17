package com.pmo.dashboard.dao;

import com.pmo.dashboard.entity.Currency;

public interface CurrencyMapper {
    int deleteByPrimaryKey(String id);

    int insert(Currency record);

    int insertSelective(Currency record);

    Currency selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Currency record);

    int updateByPrimaryKey(Currency record);
}