package com.xiaozhisha.vv.Dao;

import com.xiaozhisha.vv.Form.TbCities;

public interface TbCitiesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbCities record);

    int insertSelective(TbCities record);

    TbCities selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbCities record);

    int updateByPrimaryKey(TbCities record);
}