package com.xiaozhisha.vv.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xiaozhisha.vv.entity.TbHero;
import com.xiaozhisha.vv.mapper.TbHeroMapper;
import com.xiaozhisha.vv.service.TbHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lixiao
 * @since 2019-05-02
 */
@Service
public class TbHeroServiceImpl extends ServiceImpl<TbHeroMapper, TbHero> implements TbHeroService {

    @Autowired
    TbHeroMapper heroMapper;

    @Override
    public void delete(TbHero hero) {
        heroMapper.delete(hero);
    }
}
