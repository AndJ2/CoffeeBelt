package com.example.CoffeeBelt.repository;

import com.example.CoffeeBelt.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}

