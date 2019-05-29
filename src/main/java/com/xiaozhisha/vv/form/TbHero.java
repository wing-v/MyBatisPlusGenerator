package com.xiaozhisha.vv.form;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lixiao
 * @since 2019-05-02
 */
@TableName("tb_hero")
public class TbHero extends Model<TbHero> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String bid;
    private String name;
    private Double age;
    private String description;
    private String address;
    private Double salary;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
