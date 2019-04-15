package com.xiaozhisha.vv.Dao;

import com.xiaozhisha.vv.Form.TbAddress;
import org.springframework.stereotype.Repository;

@Repository
public interface TbAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbAddress record);

    int insertSelective(TbAddress record);

    TbAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbAddress record);

    int updateByPrimaryKey(TbAddress record);
}