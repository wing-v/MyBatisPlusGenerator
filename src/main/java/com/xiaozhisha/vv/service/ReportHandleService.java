package com.xiaozhisha.vv.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 *  excel 文件导入处理service
 * @author lx
 * @date 2019/5/1 12:03
 */
public interface ReportHandleService {
    /**
     * @param file
     * @throws IOException
     */
    void importReport(MultipartFile file) throws IOException;
}
