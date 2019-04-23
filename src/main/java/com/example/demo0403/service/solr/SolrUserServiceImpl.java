package com.example.demo0403.service.solr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo0403.domain.solr.SolrUsers;

@Service
public class SolrUserServiceImpl implements SolrUserService{

    @Override
    public SolrUsers addUsers(SolrUsers user) {
        
        return user;
    }

}
