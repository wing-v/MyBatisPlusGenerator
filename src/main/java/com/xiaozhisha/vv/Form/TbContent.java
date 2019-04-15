package com.xiaozhisha.vv.Form;

import lombok.Data;

@Data
public class TbContent {
    private Long id;

    private Long categoryId;

    private String title;

    private String url;

    private String pic;

    private String status;

    private Integer sortOrder;

   }