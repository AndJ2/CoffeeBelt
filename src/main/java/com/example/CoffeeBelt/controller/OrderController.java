package com.example.CoffeeBelt.controller;

import com.example.CoffeeBelt.Model.Member;
import com.example.CoffeeBelt.Model.Menu;
import com.example.CoffeeBelt.Model.Orderc;
import com.example.CoffeeBelt.repository.MemberRepository;
import com.example.CoffeeBelt.repository.MenuRepository;
import com.example.CoffeeBelt.repository.OrdercRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class OrderController {
// 장바구니 컨트롤러
    @Autowired
    private MenuRepository menuRepository;

    //장바구니 페이지로 이동
    @GetMapping("order")
    public String Order(Model model) {
        System.out.println("장바구니 페이지");
        return "/Order";
    }

    @GetMapping("orderdetail")
    public String orderD(Model model, @RequestParam(required = false) String m_name, String img) {
        if(m_name == null) {
            return "mainc";
        } else {
            Menu menu = menuRepository.findById(m_name).orElse(null);
            System.out.println(menu.getM_name());

            model.addAttribute("menu", menu);
            model.addAttribute("orderc", new Orderc());
            return "OrderDetail";
        }
    }

    @PostMapping("orderdetail")
    public String orderDSubmit(@ModelAttribute Orderc orderc) {
        return "redirect:/MainC";
    }

}
