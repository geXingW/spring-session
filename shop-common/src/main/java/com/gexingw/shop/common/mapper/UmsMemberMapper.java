package com.gexingw.shop.common.mapper;

import com.gexingw.shop.common.entity.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/11
 * @time: 18:01
 */
@Mapper
public interface UmsMemberMapper {

    UmsMember findByUsername(@Param("username") String username);
}
