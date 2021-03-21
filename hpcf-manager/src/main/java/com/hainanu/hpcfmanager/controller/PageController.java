package com.hainanu.hpcfmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 吼吼权
 * @version 1.0
 * @date 2021/3/21 22:16
 */
@Controller
public class PageController {

    /**
     *
     * @return 设置默认欢迎页
     */
    @RequestMapping("/")
    public String defaultPath() {
        return "login";
    }

    /**
     *
     * @return 跳转到主页
     */
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
