package com.example.demo0403.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo0403.domain.rbac.Menu;

public interface MenuDao extends JpaRepository<Menu, Integer>{

}
