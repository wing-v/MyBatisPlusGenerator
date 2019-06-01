package com.xiaozhisha.vv.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lixiao
 * @since 2019-06-01
 */
@TableName("excel_template_config")
public class ExcelTemplateConfig extends Model<ExcelTemplateConfig> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    /**
     * excel名称
     */
    private String excelName;
    /**
     * 配置
     */
    private String sheetVo;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExcelName() {
        return excelName;
    }

    public void setExcelName(String excelName) {
        this.excelName = excelName;
    }

    public String getSheetVo() {
        return sheetVo;
    }

    public void setSheetVo(String sheetVo) {
        this.sheetVo = sheetVo;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ExcelTemplateConfig{" +
        ", id=" + id +
        ", excelName=" + excelName +
        ", sheetVo=" + sheetVo +
        "}";
    }
}
