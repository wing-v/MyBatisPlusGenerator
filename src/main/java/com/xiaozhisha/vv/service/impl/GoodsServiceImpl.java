package com.xiaozhisha.vv.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xiaozhisha.vv.dao.TbGoodsMapper;
import com.xiaozhisha.vv.constantEnum.PageHelp;
import com.xiaozhisha.vv.form.TbGoods;
import com.xiaozhisha.vv.service.IGoodsService;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author chenmc
 * @date 2019/4/15 23:14
 * @param 
 * @return 
 */
@Service
@Log4j
public class GoodsServiceImpl implements IGoodsService {

    Logger logger = LoggerFactory.getLogger(GoodsServiceImpl.class);

    @Autowired
    TbGoodsMapper tbGoodsMapper;

    @Override
    public List<TbGoods> getGoodsList(TbGoods goods) {
        Page<TbGoods> page = PageHelper.startPage(PageHelp.pageNum.getNum(), PageHelp.pageSize.getNum(), true, true, true).setOrderBy("id desc");
        logger.info("总数据条数 :",page.getTotal());
        return tbGoodsMapper.getGoodsList(goods);
    }

    @Override
    public TbGoods selectByPrimaryKey(Long id) {
        return  tbGoodsMapper.selectByPrimaryKey(id);
    }
}
