package com.xiaozhisha.vv.Dao;

import com.xiaozhisha.vv.Form.TbSpecificationOption;

public interface TbSpecificationOptionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbSpecificationOption record);

    int insertSelective(TbSpecificationOption record);

    TbSpecificationOption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSpecificationOption record);

    int updateByPrimaryKey(TbSpecificationOption record);
}