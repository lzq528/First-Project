package com.woniu.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.IUserDao;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;

@Service // 声明被IoC管理
@Transactional // 声明本类被事务管理器切入
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserDao userDao;
	@Override
	public void save(User obj) {
		
		userDao.save(obj);
		/*
		   *  可以加入事务处理
		 * System.out.println(1/0); 
		 * User user = new User();
		 * user.setUname("Tom");  
		 * userDao.save(obj);
		 */
	}

	@Override
	public List<User> findAll() {
		
		return userDao.findAll(); 
	}
	
	
}
