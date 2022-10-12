package com.gexingw.shop.common.service.impl;

import com.gexingw.shop.common.entity.PmsProduct;
import com.gexingw.shop.common.mapper.PmsProductMapper;
import com.gexingw.shop.common.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/12
 * @time: 11:34
 */
@Service
public class PmsProductServiceImpl implements PmsProductService {

    @Autowired
    PmsProductMapper productMapper;

    @Override
    public PmsProduct findById(Long id){
        return productMapper.findById(id);
    }
}
