package com.xiaozhisha.vv.mapper;

import com.xiaozhisha.vv.form.TbAddress;
import org.springframework.stereotype.Repository;

/**
 * @author lx
 * @date 2019/4/15 23:24
 * @param 
 * @return 
 */
@Repository
public interface TbAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbAddress record);

    int insertSelective(TbAddress record);

    TbAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbAddress record);

    int updateByPrimaryKey(TbAddress record);
}