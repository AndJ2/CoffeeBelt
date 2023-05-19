package com.example.CoffeeBelt.controller;

import com.example.CoffeeBelt.Model.Member;
import com.example.CoffeeBelt.Model.Menu;
import com.example.CoffeeBelt.repository.MemberRepository;
import com.example.CoffeeBelt.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
// 메인 c,d에 대한 컨트롤러
    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/")
    public String Main(Model model) {
        List<Menu> menus = menuRepository.findAll();
        model.addAttribute("menus", menus);
        return "MainC";
    }

    // 커피 페이지로 이동
    @GetMapping("mainc")
    public String Coffee(Model model) {
        List<Menu> menus = menuRepository.findAll();
        model.addAttribute("menus", menus);
        return "MainC";
    }

}
