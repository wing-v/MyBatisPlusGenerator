package com.xiaozhisha.vv.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 *  excel 文件导入处理service
 * @author lx
 * @date 2019/5/1 12:03
 */
public interface ReportHandleService {
    void importReport(MultipartFile file, InputStream inputStream) throws IOException;
}
