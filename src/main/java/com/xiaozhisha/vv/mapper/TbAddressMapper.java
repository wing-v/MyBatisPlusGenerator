package com.xiaozhisha.vv.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xiaozhisha.vv.entity.TbAddress;
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
public interface TbAddressMapper extends BaseMapper<TbAddress> {

    /**
     * @param address
     */
    void delete(TbAddress address);
}
