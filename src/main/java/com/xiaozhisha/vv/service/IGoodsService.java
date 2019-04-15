package com.xiaozhisha.vv.service;

import com.xiaozhisha.vv.form.TbGoods;

import java.util.List;

public interface IGoodsService {

    List<TbGoods> getGoodsList(TbGoods goods);

    TbGoods selectByPrimaryKey(Long id);
}
