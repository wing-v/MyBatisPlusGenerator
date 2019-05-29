package com.xiaozhisha.vv.utils;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;

/**
 * description : 报表导入工具类
 *
 * @author XZHSHA
 */
public class ImportUtils {

    /**
     * 读取cell 内容返回 String 类型
     */
    public static String getCellValue(XSSFCell cell) {
        if (null == cell){
            return "";
        }
        String cellValue = "";
        CellType cellType = cell.getCellType();
        switch (cellType) {
            case STRING:
                cellValue = cell.getStringCellValue().trim();
                break;
            case BOOLEAN:
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            case NUMERIC:
                cellValue = String.valueOf(cell.getNumericCellValue());
                break;
            default:
                cellValue = "";
                break;
        }
        return cellValue;
    }
}
