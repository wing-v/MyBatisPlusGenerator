package com.xiaozhisha.vv.controller;

import com.xiaozhisha.vv.form.TbGoods;
import com.xiaozhisha.vv.service.IGoodsService;
import com.xiaozhisha.vv.utils.WebResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lx
 * @date 2019/4/15 23:34
 */
@RestController
@RequestMapping("/product/manage")
@Slf4j
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

    @PostMapping("/getGoodsList")
    public List<TbGoods> getGoodsList(TbGoods goods){
        return goodsService.getGoodsList(goods);
    }

    @PostMapping(value = "/selectGoodsList")
    public TbGoods selectGoodsList(Long id){
        return goodsService.selectByPrimaryKey(id);
    }

    @PostMapping("/getWebGoods")
    public WebResponse<Object> getWebGoods(TbGoods goods){
        WebResponse<Object> response = new WebResponse<>();
        List<TbGoods> goodsList = goodsService.getGoodsList(goods);
        response.setData(goodsList);
        return response;
    }
}
