package com.xiaozhisha.vv.Service;

import com.xiaozhisha.vv.Form.TbGoods;

import java.util.List;

public interface IGoodsService {

    List<TbGoods> getGoodsList(TbGoods goods);

    TbGoods selectByPrimaryKey(Long id);
}
