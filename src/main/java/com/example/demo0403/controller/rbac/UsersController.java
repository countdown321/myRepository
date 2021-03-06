package com.example.demo0403.controller.rbac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo0403.domain.rbac.Users;
import com.example.demo0403.service.rbac.UsersService;
import com.example.demo0403.service.rbac.UsersServiceImpl;


@Controller
public class UsersController {

    @Autowired
    private UsersService usersSevice;
    
    @RequestMapping("/login")
    public String login(Users users){
        Users user = usersSevice.findUsers(users);
        if(user!=null){
            return "main";
        }else{
            return "index";
        }
    }
}
