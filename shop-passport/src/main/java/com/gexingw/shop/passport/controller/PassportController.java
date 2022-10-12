package com.gexingw.shop.passport.controller;

import com.gexingw.shop.common.entity.UmsMember;
import com.gexingw.shop.common.service.UmsMemberService;
import com.gexingw.shop.passport.dto.LoginParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/11
 * @time: 20:35
 */
@Controller
@RequestMapping("passport")
public class PassportController {

    @Autowired
    UmsMemberService memberService;

    @GetMapping("login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("login")
    public String loginCheck(LoginParams loginParams, RedirectAttributes redirectAttributes, HttpSession session) {
        System.out.println(loginParams);

        HashMap<Object, Object> errors = new HashMap<>();
        UmsMember member = memberService.findByUsername(loginParams.getUsername());
        if (member == null) {
            errors.put("msg", "用户名密码错误！");
            redirectAttributes.addFlashAttribute("errors", errors);
            return "redirect:/passport/login";
        }

        // 写入Session
        session.setAttribute("auth_id", member.getId());
        session.setAttribute("member", member);

        return "redirect:/";
    }

}
