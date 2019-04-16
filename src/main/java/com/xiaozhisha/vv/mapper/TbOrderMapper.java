package com.xiaozhisha.vv.mapper;

import com.xiaozhisha.vv.form.TbOrder;

public interface TbOrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    TbOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKey(TbOrder record);
}