package com.zhss.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class ProductController {

    @RequestMapping("/product/getProName")
    public String getProductName(){
        log.info("获取商品属性名称 --- > {}","苹果");
        return "success";
    }
}
