package com.example.demo0403.service.rbac;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.demo0403.dao.UsersDao;
import com.example.demo0403.domain.rbac.Users;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDao usesDao;
	
	@Override
	@Cacheable(value="cacheTest")
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return usesDao.findAll();
	}

	@Override
	@CacheEvict(value="cacheTest",allEntries=true)
	public void addUsers(Users user) {
		usesDao.save(user);
		// TODO Auto-generated method stub
		
	}

	@Override
	@Cacheable(cacheNames="cacheTest")
	public Optional<Users> finById(Integer id) {
		// TODO Auto-generated method stub
		return usesDao.findById(id);
	}

	@Override
	@Cacheable(value="cacheTest",key="#pageable.pageSize")
	public Page<Users> findByPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return usesDao.findAll(pageable);
	}

    @Override
    public Users findUsers(Users users) {
        // TODO Auto-generated method stub
        return usesDao.findUsers(users.getUsername(), users.getPassword());
    }

}
