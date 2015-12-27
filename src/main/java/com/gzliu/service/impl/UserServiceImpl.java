package com.gzliu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzliu.dao.UserDao;
import com.gzliu.service.UserService;
import com.gzliu.vo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public void inserUser(User user) {
		System.out.print(userDao.insertUser(user));
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
