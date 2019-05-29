package com.xiaozhisha.vv.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xiaozhisha.vv.entity.TbAddress;
import com.xiaozhisha.vv.mapper.TbAddressMapper;
import com.xiaozhisha.vv.service.TbAddressService;
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
public class TbAddressServiceImpl extends ServiceImpl<TbAddressMapper, TbAddress> implements TbAddressService {

    @Autowired
    TbAddressMapper addressMapper;

    @Override
    public void delete(TbAddress address) {
        addressMapper.delete(address);
    }
}
