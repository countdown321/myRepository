package com.example.demo0403.solr;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
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
public class SolrTest {

    @Autowired
    SolrClient solrClient;
    
    @Test
    public void testAddUsers()  throws IOException, SolrServerException{
           
        SolrInputDocument doc = new SolrInputDocument();
        doc.setField("id", "10");
        doc.setField("name", "测试");
        //实例化solr对象
        solrClient.add(doc);
        solrClient.commit();
    }
    
   
}
