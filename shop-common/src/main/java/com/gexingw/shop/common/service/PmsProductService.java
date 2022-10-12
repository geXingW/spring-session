package com.gexingw.shop.common.service;

import com.gexingw.shop.common.entity.PmsProduct;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/12
 * @time: 11:34
 */
public interface PmsProductService {
    PmsProduct findById(Long id);
}
