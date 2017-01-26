package com.forsfortis.springweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forsfortis.springweb.dao.UserDao;
import com.forsfortis.springweb.service.UserService;
import com.forsfortis.springweb.validators.UserVO;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public List<UserVO> listUsers(){
		return userDao.listUser();
	}
	@Override
	public boolean addUser(UserVO user) {
		return userDao.addUser(user);
	}
}
