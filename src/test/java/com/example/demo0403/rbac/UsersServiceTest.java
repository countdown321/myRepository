package com.example.demo0403.rbac;
/*package com.example.demo0403;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo0403.domain.Role;
import com.example.demo0403.domain.Users;
import com.example.demo0403.service.RoleService;
import com.example.demo0403.service.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Demo0403Application.class)
public class UsersServiceTest {

    @Autowired
    public UsersService usersSevice;
    
    @Autowired
    public RoleService roleService;

    
     * @Test public void addTest() { Users user = new Users(); user.setName("里斯"); user.setSex("女");
     * usersSevice.addUsers(user); }
     * 
     * @Test public void finByTest() { usersSevice.finById(2);
     * System.out.println("-------------------------"); usersSevice.finById(2); }
     * 
     * @Test public void pageTest() { Pageable pageable = new PageRequest(0, 2);
     * System.out.println(usersSevice.findByPage(pageable).getTotalElements());
     * System.out.println("-------------------------");
     * System.out.println(usersSevice.findByPage(pageable).getTotalElements());
     * System.out.println("-------------------------"); pageable = new PageRequest(1, 2);
     * System.out.println(usersSevice.findByPage(pageable).getTotalElements()); }
     * 
     * @Test public void testFindAll() { System.out.println(usersSevice.findAll().size());
     * System.out.println("-------------------------"); Users user = new Users();
     * user.setName("赵六"); user.setSex("女"); usersSevice.addUsers(user);
     * System.out.println(usersSevice.findAll().size()); }
     

    @Test
    public void testFindUsers() {
        Users user = new Users();
        user.setUsername("张三");
        user.setPassword("123");
        Users users = usersSevice.findUsers(user);
        if(users!=null) {
            System.out.println(users.getUsername()+":"+users.getRole().getName()+users.getRole().getMenuList().toString());
        }
    }
    
    @Test
    public void testAddUsers() {
        Users user = new Users();
        user.setUsername("hmy");
        user.setPassword("xxxxx");
        List<Role> list = roleService.findAll();
        Integer roleId = null;
        for (Role role : list) {
            System.out.println(role.getName());
            if("管理员".equals(role.getName())) {
                roleId = role.getId();
            }
        }
        Role role = new Role();
        role.setId(roleId);
        user.setRole(role);
        usersSevice.addUsers(user);
    }

}
*/