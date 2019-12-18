package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IUserDao;
import com.woniu.pojo.User;

@Repository // 被SpringIoC管理
public class UserDaoImpl implements IUserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(User obj) {
		/*
		 * getCurrentSession():
		   *   获取和当前线程绑定的session，如果为空则调用openSession，有利于跨控制器的事务控制
		   *   使用前需要在hibernate.cfg.xml中配置并且在查询时也必须在事务控制下，不需要手动关闭
		   *   在事务提交或回滚的时候会自动关闭，但仍然建议手动关闭
		 * openSession():
		   *    获取一个新的Session，不需要在事务控制下，但必须手动关闭 
		 */
		
		sessionFactory.openSession().save(obj);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		
		return sessionFactory.openSession().createCriteria(User.class).list();
	}
}
