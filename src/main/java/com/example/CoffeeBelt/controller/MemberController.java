package com.example.CoffeeBelt.controller;

import com.example.CoffeeBelt.Model.Member;
import com.example.CoffeeBelt.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/login")
    public String Login2() {
        return "login";
    }

    @GetMapping("join")
    public String join(Model model) {
        model.addAttribute("member", new Member());
        return "Join";
    }

    @PostMapping("join")
    public String greetingSubmit(@ModelAttribute Member member) {
        memberRepository.save(member);
        return "redirect:/login";
    }

}
