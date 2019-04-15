package com.xiaozhisha.vv.controller;

import com.xiaozhisha.vv.form.TbGoods;
import com.xiaozhisha.vv.service.IGoodsService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product/manage")
@Log4j
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

    @PostMapping("getGoodsList")
    public List<TbGoods> getGoodsList(TbGoods goods){
        return goodsService.getGoodsList(goods);
    }

    @PostMapping(value = "selectGoodsList")
    public TbGoods selectGoodsList(Long id){
        return goodsService.selectByPrimaryKey(id);
    }
}
