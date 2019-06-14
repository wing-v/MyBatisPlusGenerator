package com.xiaozhisha.vv.controller;

import com.xiaozhisha.vv.service.ReportHandleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

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
     * @description 导入Excel报表
     * @date 2019/5/1 17:01
     */
    @RequestMapping(value = "/import", method = RequestMethod.POST)
    public String importReport(MultipartFile file) throws IOException {
        String filename = file.getOriginalFilename();
        log.info("excel name is { } " + filename, filename);
        reportHandleService.importReport(file);
        return "success";
    }
}
