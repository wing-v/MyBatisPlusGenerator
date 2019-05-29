package com.xiaozhisha.vv.service;

import com.xiaozhisha.vv.entity.TbAddress;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lixiao
 * @since 2019-05-02
 */
public interface TbAddressService extends IService<TbAddress> {

    void delete(TbAddress address);
}
