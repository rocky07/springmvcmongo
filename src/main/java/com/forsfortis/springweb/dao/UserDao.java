package com.forsfortis.springweb.dao;

import java.util.List;

import com.forsfortis.springweb.validators.UserVO;


public interface UserDao {
	public List<UserVO> listUser(); 
	public boolean addUser(UserVO uservo);
}
