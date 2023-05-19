package com.example.CoffeeBelt.controller;

import com.example.CoffeeBelt.Model.Member;
import com.example.CoffeeBelt.Model.Menu;
import com.example.CoffeeBelt.Model.Orderc;
import com.example.CoffeeBelt.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StarController {
    // 별점 컨트롤러
    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("star")
    public String star(Model model, @RequestParam(required = false) String m_name) {
        if(m_name == null) {

        } else {
            Menu menu = menuRepository.findById(m_name).orElse(null);
            System.out.println(menu.getM_name());
            System.out.println(menu.getImg());
            model.addAttribute("menu", menu);

        }
        return "Star";
    }

    @PostMapping("star")
    public String starSubmit(@ModelAttribute Menu menu) {
        menuRepository.save(menu);
        return "redirect:/mainc";
    }
}
