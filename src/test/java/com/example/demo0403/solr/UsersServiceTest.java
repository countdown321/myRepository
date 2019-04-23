package com.example.demo0403.solr;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo0403.Demo0403Application;
import com.example.demo0403.domain.rbac.Menu;
import com.example.demo0403.domain.rbac.Role;
import com.example.demo0403.domain.solr.SolrUsers;
import com.example.demo0403.service.rbac.MenuService;
import com.example.demo0403.service.rbac.RoleService;
import com.example.demo0403.service.solr.SolrUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Demo0403Application.class)
public class UsersServiceTest {

    @Autowired
    public SolrUserService solrUserService;
    
    @Autowired
    public SolrClient solrClient;
    
    @Test
    public void testAddUsers()  throws IOException, SolrServerException{
        
        SolrUsers user = new SolrUsers();
        user.setId("10");
        user.setName("ceshi");
        SolrUsers userSolr = solrUserService.addUsers(user);
        solrClient.addBean(userSolr);
        solrClient.commit();
    }
    
   
}
