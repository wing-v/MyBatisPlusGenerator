package com.xiaozhisha.vv.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author lixiao
 * @since 2019-05-02
 */
@Data
@TableName("tb_address")
public class TbAddress extends Model<TbAddress> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 省
     */
    private String provinceId;
    /**
     * 市
     */
    private String cityId;
    /**
     * 县/区
     */
    private String townId;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 联系人
     */
    private String contact;
    /**
     * 是否是默认 1默认 0否
     */
    private String isDefault;
    /**
     * 备注
     */
    private String notes;
    /**
     * 创建日期
     */
    private Date createDate;
    /**
     * 别名
     */
    private String alias;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
