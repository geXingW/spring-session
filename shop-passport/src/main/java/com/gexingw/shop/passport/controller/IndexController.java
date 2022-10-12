package com.gexingw.shop.passport.controller;

import com.gexingw.shop.common.entity.UmsMember;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/11
 * @time: 21:16
 */
@RestController
@RequestMapping
public class IndexController {

    @GetMapping
    public String index(HttpSession session) {
        if (session.getAttribute("member") == null) {
            return "Passport index controller";
        }

        UmsMember member = (UmsMember) session.getAttribute("member");

        return "Passport index with login user: " + member.getId();
    }
}
