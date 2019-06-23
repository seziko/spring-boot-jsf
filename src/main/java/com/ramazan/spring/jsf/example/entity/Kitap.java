package com.ramazan.spring.jsf.example.entity;

import javax.persistence.*;

@Table(name = "kitap")
public class Kitap extends BaseEntity{


    @Column(name = "adi",nullable = false,length = 20)
    private String adi;
    @Column(name = "yazari",nullable = false,length = 10)
    private String yazari;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kitap_bilgi_id")
    private KitapBilgi kitapBilgi;
}