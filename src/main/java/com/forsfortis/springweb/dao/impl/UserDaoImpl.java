package com.forsfortis.springweb.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.forsfortis.springweb.dao.UserDao;
import com.forsfortis.springweb.validators.UserVO;


@Component

public class UserDaoImpl implements UserDao {

	private static final String USERS_COLLECTION="users";
	@Resource
	@Qualifier("mongoTemplate")
	private MongoOperations mongoTemplate;
	
	public UserDaoImpl(){
		
	}
		
	@Override
	public List<UserVO> listUser() {
		return this.mongoTemplate.findAll(UserVO.class,USERS_COLLECTION);
	}

	@Override
	public boolean addUser(UserVO uservo) {
		this.mongoTemplate.insert(uservo, USERS_COLLECTION);
		return true;
	}

}
