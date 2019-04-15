package com.xiaozhisha.vv.Dao;

import com.xiaozhisha.vv.Form.TbBrand;

public interface TbBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbBrand record);

    int insertSelective(TbBrand record);

    TbBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbBrand record);

    int updateByPrimaryKey(TbBrand record);
}