package com.example.demo0403.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="menu")
@Getter
@Setter
public class Menu implements Serializable{

    private static final long serialVersionUID = 8914767049022457209L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="pid")
    private Integer pid;
    
    /*private List<Menu> childrenMenu;*/

}
