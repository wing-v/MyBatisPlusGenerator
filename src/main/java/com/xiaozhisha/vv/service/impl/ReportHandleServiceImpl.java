package com.xiaozhisha.vv.service.impl;

import com.xiaozhisha.vv.entity.TbAddress;
import com.xiaozhisha.vv.entity.TbHero;
import com.xiaozhisha.vv.mapper.TbHeroMapper;
import com.xiaozhisha.vv.service.ReportHandleService;
import com.xiaozhisha.vv.service.TbAddressService;
import com.xiaozhisha.vv.service.TbHeroService;
import com.xiaozhisha.vv.utils.ImportUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *  excel 文件导入实现类
 * @author lx
 * @date 2019/5/1 12:16
 */
@Service
@Slf4j
public class ReportHandleServiceImpl implements ReportHandleService {
    @Autowired
    TbHeroService heroService;
    @Autowired
    TbAddressService addressService;
    @Autowired
    TbHeroMapper heroMapper;

   /* @Override
    public void importReport(MultipartFile file) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
        Sheet sheet = workbook.getSheetAt(0);
        //获取每个Excel有多少sheet页
        List<TbHero> heroes = new ArrayList<>();
        List<TbAddress> addresses = new ArrayList<>();

        //当前只有一个sheet
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext())
        {
            Row currentRow = iterator.next();
            //表头（第一行）
            if (currentRow.getRowNum() == 0) {
                continue;
            }

            // generate demo object.
            TbHero hero = new TbHero();
            hero.setBid(currentRow.getCell(0).getStringCellValue());
            hero.setName(currentRow.getCell(1).getStringCellValue());
            hero.setAge(currentRow.getCell(2).getNumericCellValue());
            hero.setDescription(currentRow.getCell(3).getStringCellValue());
            hero.setAddress(currentRow.getCell(4).getStringCellValue());
            hero.setSalary((currentRow.getCell(5).getNumericCellValue()));
            log.info(hero.toString());
            heroes.add(hero);
        }
//        插入前先删除数据
//         beforeHandle();

        heroService.insertBatch(heroes);
    }*/

    @Override
    public void importReport(MultipartFile file) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
        Sheet sheet = workbook.getSheetAt(0);
        //获取每个Excel有多少sheet页
        List<TbHero> heroes = new ArrayList<>();
        List<TbAddress> addresses = new ArrayList<>();

        //当前只有一个sheet
        Iterator<Row> iterator = sheet.iterator();

        List<List<Object>> dataList = new ArrayList<>();

        int lastRowNum = sheet.getLastRowNum();
        while (iterator.hasNext())
        {
            Row currentRow = iterator.next();
            //表头（第一行）
            if (currentRow.getRowNum() == 0) {
                continue;
            }
            // generate demo object.
            TbHero hero = new TbHero();
            String cellValue = "";
            for (int i = 0; i <= lastRowNum + 1; i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    //每行列数
                    short lastCellNum = row.getLastCellNum();
                    for (int j = 0; j <lastCellNum ; j++) {
                        Cell cell = row.getCell(j);
                        cellValue = ImportUtils.getCellValue(cell);
                    }
                }

            }
            log.info(hero.toString());
            heroes.add(hero);
        }
//        插入前先删除数据
//         beforeHandle();

        heroService.insertBatch(heroes);
    }

//    插入前先删除
    public void beforeHandle(){
        heroMapper.deleteAll();
    }
}
