/**
 * 
 */
package com.wat.jinxiaocun.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.wat.jinxiaocun.beans.User;
import com.wat.jinxiaocun.dao.UserDao;

/**
 * @author Jerome X H Chang
 *
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wat.jinxiaocun.dao.UserDao#save(com.wat.jinxiaocun.beans.User)
	 */
	@Override
	public int save(User u) {
		Session session = sessionFactory.getCurrentSession();
		session.save(u);
		return u.getId();
	}

	@Override
	public User findById(int id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

}
