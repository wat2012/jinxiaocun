/**
 * 
 */
package com.wat.jinxiaocun.dao;

import com.wat.jinxiaocun.beans.User;

/**
 * @author Jerome X H Chang
 *
 */
public interface UserDao {
	/**
	 * 
	 * @param u
	 * @return
	 */
	public int save(User u);

	public User findById(int id);
}
