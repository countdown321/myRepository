package com.example.demo0403.domain.rbac;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="menu")
@Getter
@Setter
@ToString
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
    
    @ManyToMany(mappedBy="menuList",fetch=FetchType.EAGER)//拥有mappedBy注解的实体类为关系被维护端
    private Set<Role> roleList=new HashSet<>();

}
