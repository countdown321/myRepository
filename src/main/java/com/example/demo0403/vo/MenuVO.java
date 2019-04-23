package com.example.demo0403.vo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MenuVO{

    private Integer id;
    
    private String name;
    
    private Integer pid;
    
    private List<MenuVO> childrenMenu;

}
