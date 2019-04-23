package com.example.demo0403.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo0403.domain.rbac.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{

    @Query("select u from Users u where username=?1 and password=?2")
    public Users findUsers(String username,String password);
}
