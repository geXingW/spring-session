package com.gexingw.shop.port.controller;

import com.gexingw.shop.common.entity.UmsMember;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/12
 * @time: 11:41
 */
@RequestMapping
@RestController
public class IndexController {

    @GetMapping
    public String index(HttpSession session) {
        if (session.getAttribute("member") == null) {
            return "Port index controller";
        }

        UmsMember member = (UmsMember) session.getAttribute("member");

        return "Port index with login user: " + member.getId();
    }
}
