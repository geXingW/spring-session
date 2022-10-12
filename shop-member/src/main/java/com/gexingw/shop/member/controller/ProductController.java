package com.gexingw.shop.member.controller;

import com.gexingw.shop.common.entity.PmsProduct;
import com.gexingw.shop.common.service.PmsProductService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/12
 * @time: 11:29
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    PmsProductService productService;

    @GetMapping("/{id}")
    public PmsProduct info(@PathVariable Long id){
        return productService.findById(id);
    }
}
