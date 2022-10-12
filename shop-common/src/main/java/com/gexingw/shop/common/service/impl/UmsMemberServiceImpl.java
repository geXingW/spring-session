package com.gexingw.shop.common.service.impl;

import com.gexingw.shop.common.entity.UmsMember;
import com.gexingw.shop.common.mapper.UmsMemberMapper;
import com.gexingw.shop.common.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/11
 * @time: 18:03
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    UmsMemberMapper memberMapper;

    @Override
    public UmsMember findByUsername(String username) {
        return memberMapper.findByUsername(username);
    }
}
