package com.example.demo0403.service.rbac;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo0403.dao.RoleDao;
import com.example.demo0403.domain.rbac.Role;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleDao roleDao;
    
    @Override
    public List<Role> findAll() {
        // TODO Auto-generated method stub
        return roleDao.findAll();
    }

    @Override
    public Optional<Role> findById(Integer id) {
        // TODO Auto-generated method stub
        return roleDao.findById(id);
    }

    @Override
    public void saveRole(Role role) {
        // TODO Auto-generated method stub
        roleDao.save(role);
    }

}
