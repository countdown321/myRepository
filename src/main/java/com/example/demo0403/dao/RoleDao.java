package com.example.demo0403.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo0403.domain.rbac.Role;

public interface RoleDao extends JpaRepository<Role , Integer>{


}
