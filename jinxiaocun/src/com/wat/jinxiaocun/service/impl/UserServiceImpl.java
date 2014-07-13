package com.wat.jinxiaocun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.wat.jinxiaocun.beans.User;
import com.wat.jinxiaocun.dao.UserDao;
import com.wat.jinxiaocun.service.UserService;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
    private UserDao dao;
	
	/**
	 * @return the dao
	 */
	public UserDao getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int regUser(User u){
		return dao.save( u );
	}

	@Override
	public User queryById(int id) {
		return dao.findById(id);
	}
}