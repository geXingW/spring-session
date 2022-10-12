package com.gexingw.shop.common.mapper;

import com.gexingw.shop.common.entity.PmsProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/12
 * @time: 11:31
 */
@Mapper
public interface PmsProductMapper {
    PmsProduct findById(@Param("id") Long id);
}
