package com.xiaozhisha.vv.vo;

import com.xiaozhisha.vv.entity.ExcelTemplateConfig;
import lombok.Data;

import java.io.InputStream;
import java.util.List;

/**
 * 报表配置实体
 * @author lx
 * @date 2019/5/1 12:23
 */
@Data
public class OdsReportConfigVo {

    private InputStream inputStream;

    private List<ExcelTemplateConfig> excelTemplateConfigs;
}
