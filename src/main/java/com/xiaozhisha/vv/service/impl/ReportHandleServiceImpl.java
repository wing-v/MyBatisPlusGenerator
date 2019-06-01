package com.xiaozhisha.vv.service.impl;

import com.xiaozhisha.vv.entity.TbAddress;
import com.xiaozhisha.vv.entity.TbHero;
import com.xiaozhisha.vv.service.ReportHandleService;
import com.xiaozhisha.vv.service.TbAddressService;
import com.xiaozhisha.vv.service.TbHeroService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
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

    @Override
    public void importReport(MultipartFile file, InputStream inputStream) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        //获取每个Excel有多少sheet页
        List<TbHero> heroes = new ArrayList<>();
        List<TbAddress> addresses = new ArrayList<>();
        int sheets = workbook.getNumberOfSheets();

        //当前只有一个sheet
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext())
        {
            Row currentRow = iterator.next();
            if (currentRow.getRowNum() == 0) {
                continue;
            }

            // generate demo object.
            TbHero hero = new TbHero();
            TbAddress address = new TbAddress();
            hero.setBid(currentRow.getCell(0).getStringCellValue());
            hero.setName(currentRow.getCell(1).getStringCellValue());
            hero.setAge(currentRow.getCell(2).getNumericCellValue());
            hero.setDescription(currentRow.getCell(3).getStringCellValue());
            address.setAddress(currentRow.getCell(4).getStringCellValue());
            hero.setSalary((currentRow.getCell(5).getNumericCellValue()));
            log.info(hero.toString());
            log.info(address.toString());
            heroes.add(hero);
            addresses.add(address);
        }
//        插入前先删除数据
         beforeHandle(heroes,addresses);

        heroService.insertBatch(heroes);
        addressService.insertBatch(addresses);
    }

//    插入前先删除
    public void beforeHandle(List<TbHero> heros, List<TbAddress> addresses){
        for (TbHero hero : heros) {
            if (hero == null){
                throw  new NullPointerException("TbHero 中没有要删除的数据");
            }
            heroService.delete(hero);
            log.info("TbHero 数据删除成功");
        }
        for (TbAddress address : addresses) {
            if (address == null){
                throw  new NullPointerException("TbAddress 中没有要删除的数据");
            }
            addressService.delete(address);
            log.info("TbAddress 数据删除成功");
        }
    }
}
