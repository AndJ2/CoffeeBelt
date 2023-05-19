package com.example.CoffeeBelt.service;

import com.example.CoffeeBelt.Model.Member;
import com.example.CoffeeBelt.repository.MemberRepository;


@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Member save(Member member) {
        return memberRepository.save(member);
    }
}
