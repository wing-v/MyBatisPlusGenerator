package com.xiaozhisha.vv.Repository;

import com.xiaozhisha.vv.Entity.TbAreasCopy;

public interface TbAreasCopyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbAreasCopy record);

    int insertSelective(TbAreasCopy record);

    TbAreasCopy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbAreasCopy record);

    int updateByPrimaryKey(TbAreasCopy record);
}