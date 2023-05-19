package com.example.CoffeeBelt.repository;

import com.example.CoffeeBelt.Model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, String> {
}
