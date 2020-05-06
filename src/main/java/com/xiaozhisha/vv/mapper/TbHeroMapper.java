package com.xiaozhisha.vv.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xiaozhisha.vv.entity.TbHero;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  mappers 接口
 * </p>
 *
 * @author lixiao
 * @since 2019-05-02
 */
@Mapper
public interface TbHeroMapper extends BaseMapper<TbHero> {

    void delete(TbHero address);
}
