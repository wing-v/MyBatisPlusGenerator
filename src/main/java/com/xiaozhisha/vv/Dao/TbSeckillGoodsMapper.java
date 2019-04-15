package com.xiaozhisha.vv.Dao;

import com.xiaozhisha.vv.Form.TbSeckillGoods;

public interface TbSeckillGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbSeckillGoods record);

    int insertSelective(TbSeckillGoods record);

    TbSeckillGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSeckillGoods record);

    int updateByPrimaryKey(TbSeckillGoods record);
}