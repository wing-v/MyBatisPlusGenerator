package com.xiaozhisha.vv.mapper;

import com.xiaozhisha.vv.form.TbGoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author lx
 * @date 2019/4/15 23:49
 */
@Mapper
@Repository
public interface TbGoodsMapper {
    /**
     * 删除
     * @author lx
     * @date 2019/4/15 23:42
     * @param  
     * @return int
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     * @author lx
     * @date 2019/4/15 23:35
     * @param record
     * @return int
     */
    int insert(TbGoods record);


    /**
     *   查询
     * @author lx
     * @date 2019/4/15 23:48
     * @param record
     * @return int
     */
    int insertSelective(TbGoods record);

//    @Select("select * from tb_goods where id = #{id}")
    /**查询
     * @author lx
     * @date 2019/4/15 23:35
     * @param  id
     * @return com.xiaozhisha.vv.form.TbGoods
     */
    TbGoods selectByPrimaryKey(Long id);

    /**
     * 更新
     *
     * @author lx
     * @date 2019/4/15 23:35
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(TbGoods record);

    /**
     * 跟新
     * @author lx
     * @date 2019/4/15 23:35
     * @param record
     * @return int
     */
    int updateByPrimaryKey(TbGoods record);

    /**
     * 查询所有
     * @author lx
     * @date 2019/4/15 23:35
     * @param goods
     * @return java.util.List<com.xiaozhisha.vv.form.TbGoods>
     */
    List<TbGoods> getGoodsList(@Param("goods") TbGoods goods);

}