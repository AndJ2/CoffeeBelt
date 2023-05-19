package com.example.CoffeeBelt.Model;

import javax.persistence.*;

@Entity
public class Orderc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long o_seq;
    private int o_num;

    @ManyToOne
    @JoinColumn(name="u_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name="m_name")
    private Menu menu;

}
