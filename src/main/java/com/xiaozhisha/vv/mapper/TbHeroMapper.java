package com.xiaozhisha.vv.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xiaozhisha.vv.entity.TbHero;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lixiao
 * @since 2019-05-02
 */
@Repository
public interface TbHeroMapper extends BaseMapper<TbHero> {
    void deleteAll();
}
