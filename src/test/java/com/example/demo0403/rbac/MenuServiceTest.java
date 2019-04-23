package com.example.demo0403.rbac;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo0403.Demo0403Application;
import com.example.demo0403.domain.rbac.Menu;
import com.example.demo0403.domain.rbac.Users;
import com.example.demo0403.service.rbac.MenuService;
import com.example.demo0403.service.rbac.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Demo0403Application.class)
public class MenuServiceTest {

    @Autowired
    public MenuService menuSevice;

    @Test
    public void testFindMenus() {
        List<Menu> list = menuSevice.findAll();
        for (Menu menu : list) {
            System.out.println(menu.getName());
        }
       
    }

}
 