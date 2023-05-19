package com.example.CoffeeBelt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyInfoController {
    // 내 정보 컨트롤러

    @GetMapping("myinfo")
    public String MyInfo(Model model) {
        System.out.println("내 정보 페이지");
        return "MyInfo";
    }

}
