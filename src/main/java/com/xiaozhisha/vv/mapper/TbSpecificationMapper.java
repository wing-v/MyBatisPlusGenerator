package com.xiaozhisha.vv.mapper;

import com.xiaozhisha.vv.form.TbSpecification;

public interface TbSpecificationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbSpecification record);

    int insertSelective(TbSpecification record);

    TbSpecification selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSpecification record);

    int updateByPrimaryKey(TbSpecification record);
}