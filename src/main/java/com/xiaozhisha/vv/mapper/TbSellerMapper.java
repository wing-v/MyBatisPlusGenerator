package com.xiaozhisha.vv.mapper;

import com.xiaozhisha.vv.form.TbSeller;

public interface TbSellerMapper {
    int deleteByPrimaryKey(String sellerId);

    int insert(TbSeller record);

    int insertSelective(TbSeller record);

    TbSeller selectByPrimaryKey(String sellerId);

    int updateByPrimaryKeySelective(TbSeller record);

    int updateByPrimaryKey(TbSeller record);
}