package com.xiaozhisha.vv.Repository;

import com.xiaozhisha.vv.Entity.TbPayLog;

public interface TbPayLogMapper {
    int deleteByPrimaryKey(String outTradeNo);

    int insert(TbPayLog record);

    int insertSelective(TbPayLog record);

    TbPayLog selectByPrimaryKey(String outTradeNo);

    int updateByPrimaryKeySelective(TbPayLog record);

    int updateByPrimaryKey(TbPayLog record);
}