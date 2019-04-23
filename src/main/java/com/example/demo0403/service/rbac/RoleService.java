package com.example.demo0403.service.rbac;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.example.demo0403.domain.rbac.Role;

public interface RoleService {

    public List<Role> findAll();
    
    public Optional<Role> findById(Integer id);
    
    public void saveRole(Role role);
    
}
