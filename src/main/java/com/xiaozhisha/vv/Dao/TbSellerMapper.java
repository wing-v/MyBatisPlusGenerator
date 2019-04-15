package com.xiaozhisha.vv.Dao;

import com.xiaozhisha.vv.Form.TbSeller;

public interface TbSellerMapper {
    int deleteByPrimaryKey(String sellerId);

    int insert(TbSeller record);

    int insertSelective(TbSeller record);

    TbSeller selectByPrimaryKey(String sellerId);

    int updateByPrimaryKeySelective(TbSeller record);

    int updateByPrimaryKey(TbSeller record);
}