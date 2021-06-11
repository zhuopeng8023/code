package com.zhss.controller;


import cn.hutool.core.io.FileUtil;
import com.alibaba.cloud.commons.io.FileUtils;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@Log4j2
@RefreshScope
@RestController
public class OrderController {

     @Autowired
     private RestTemplate restTemplate;

     @Value("${confValue}")
     private String confValue;

     @GetMapping("/order/create")
     public String createOrder(Integer productId,Integer userId){
         //String productName = restTemplate.getForObject("http://product-serv/product/getProName",String.class);
         //log.info("running orderController ----- > {}",confValue);
         return "success";
     }

}
