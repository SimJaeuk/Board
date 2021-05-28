package com.jaeuk.home.model;

import lombok.Data;


import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Data
public class Board {

    @Id // 기본 키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 증가시킬 것
    private Long id;
    private String title;
    private String content;
}


