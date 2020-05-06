package com.xiaozhisha.vv.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xiaozhisha.vv.entity.TbAddress;
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
public interface TbAddressMapper extends BaseMapper<TbAddress> {

    /**
     * @param address
     */
    void delete(TbAddress address);
}
