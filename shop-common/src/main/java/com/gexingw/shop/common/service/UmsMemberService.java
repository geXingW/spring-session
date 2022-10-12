package com.gexingw.shop.common.service;

import com.gexingw.shop.common.entity.UmsMember;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/11
 * @time: 18:03
 */
public interface UmsMemberService {

    /**
     * 根据用户名查找Member信息
     *
     * @param username 用户名
     * @return Member信息
     */
    UmsMember findByUsername(String username);
}
