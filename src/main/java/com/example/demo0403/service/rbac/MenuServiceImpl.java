package com.example.demo0403.service.rbac;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo0403.dao.MenuDao;
import com.example.demo0403.domain.rbac.Menu;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	private MenuDao menuDao;

    @Override
    public List<Menu> findAll() {
        // TODO Auto-generated method stub
        return menuDao.findAll();
    }

   

}
