package com.xiaozhisha.vv.controller;

import com.xiaozhisha.vv.service.ReportHandleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * Excel 文件导入处理类
 *
 * @author lx
 * @date 2019/5/1 12:04
 */
@RestController
@Slf4j
public class ReportHandleController {
    @Autowired
    ReportHandleService reportHandleService;


    /**
     * @param
     * @return void
     * @description 导入Excel报表
     * @date 2019/5/1 17:01
     */
    @RequestMapping(value = "/import", method = RequestMethod.POST)
    public void importReport(MultipartFile file, InputStream inputStream) throws IOException {
//        Assert.isNull(file,"文件不能为空！！！！！！！！！");
        String filename = file.getOriginalFilename();
        log.info("file name is",filename);
        reportHandleService.importReport(file,inputStream);
    }
}
