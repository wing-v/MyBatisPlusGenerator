package com.xiaozhisha.vv.Dao;

import com.xiaozhisha.vv.Form.TbGoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TbGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbGoods record);

    int insertSelective(TbGoods record);

//    @Select("select * from tb_goods where id = #{id}")
    TbGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbGoods record);

    int updateByPrimaryKey(TbGoods record);

    List<TbGoods> getGoodsList(@Param("goods") TbGoods goods);

}