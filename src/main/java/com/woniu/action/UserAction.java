package com.woniu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.User;
import com.woniu.service.IUserService;

@Controller
public class UserAction {
	
	@Autowired
	private IUserService us;
	private User user;
	
	public UserAction() {
		super();
		System.out.println("UserAction.UserAction()");
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String save() {
		
		us.save(user);
		return "success";
	}
	public String findAll() {
		
		us.findAll();
		return "list";
	}
	
}
