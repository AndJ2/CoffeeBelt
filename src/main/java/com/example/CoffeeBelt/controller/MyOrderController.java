package com.example.CoffeeBelt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyOrderController {
    //내 주문내역 페이지로 이동
    @GetMapping("myorder")
    public String MyOrder() {
        System.out.println("주문내역 페이지");
        return "MyOrder";
    }

    @GetMapping("bill")
    public String Bill() {
        System.out.println("영수증 페이지");
        return "Bill";
    }
}
