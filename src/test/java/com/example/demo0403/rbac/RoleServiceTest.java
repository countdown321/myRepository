package com.example.demo0403.rbac;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo0403.Demo0403Application;
import com.example.demo0403.dao.MenuDao;
import com.example.demo0403.dao.RoleDao;
import com.example.demo0403.domain.rbac.Menu;
import com.example.demo0403.domain.rbac.Role;
import com.example.demo0403.domain.rbac.Users;
import com.example.demo0403.service.rbac.MenuService;
import com.example.demo0403.service.rbac.RoleService;
import com.example.demo0403.service.rbac.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Demo0403Application.class)
public class RoleServiceTest {

    @Autowired
    public RoleService roleService;
    
    @Autowired
    public MenuService menuService;
    
    @Test
    public void testFindRoles() {
        List<Role> list = roleService.findAll();
        for (Role role : list) {
            System.out.println(role.getName());
        }
    }
    
    @Test
    public void testSaveRole() {
        //创建role
        Role role = new Role();
        role.setName("经理");
        //创建菜单
        Menu menu = new Menu();
        List<Menu> menuSet = menuService.findAll();
        for (Menu menu2 : menuSet) {
            if("系统设置".equals(menu2.getName())) {
                menu.setName(menu2.getName());
                menu.setPid(menu2.getPid());
            }
        }
        //关联
        menu.getRoleList().add(role);
        //保存
        roleService.saveRole(role);
    }

    @Test
    public void testFind() {
        Optional<Role> role = roleService.findById(2);
        System.out.println(role.get().getName()+"\n***********************************");
        Set<Menu> setMenu = role.get().getMenuList();
        for (Menu menu : setMenu) {
            System.out.println(menu.getName());
        }
    }
}
