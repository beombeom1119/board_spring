package com.study.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity             //Entity는 테이블을 의미하는데 자바의 영속성에서 어노테이션을 통해 테이블임을 알려준다.
@Data               //Lombok을 통해 매개변수를 쉽게 넘겨 줄 수 있다. (getter setter 없이)
public class Board {        // Table 이름과 같게 하는것이 좋다.


    @Id                 //primary key 임
    @GeneratedValue(strategy = GenerationType.IDENTITY) //mysql, mariaDB에서 사용함.
    private Integer id;

    private String title;

    private String content;

    private  String filename;

    private  String filepath;


}





