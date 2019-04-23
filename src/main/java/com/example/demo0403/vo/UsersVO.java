package com.example.demo0403.vo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersVO {
    
    private Integer id;
    
    private String username;
    
    private String password;
    
    private List<MenuVO> menu;
}
