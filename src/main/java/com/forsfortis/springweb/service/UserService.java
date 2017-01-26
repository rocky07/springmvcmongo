package com.forsfortis.springweb.service;

import java.util.List;

import com.forsfortis.springweb.validators.UserVO;

public interface UserService {
	public List<UserVO> listUsers();
	public boolean addUser(UserVO user);
}
