package com.example.demo0403.service.rbac;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo0403.domain.rbac.Users;

public interface UsersService {

    List<Users> findAll();

    void addUsers(Users user);

    Optional<Users> finById(Integer id);

    Page<Users> findByPage(Pageable pageable);

    Users findUsers(Users users);

}
