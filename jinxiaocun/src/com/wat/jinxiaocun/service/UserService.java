package com.wat.jinxiaocun.service;

import com.wat.jinxiaocun.beans.User;


public interface UserService{
	public int regUser(User user);

	public User queryById(int id);
}