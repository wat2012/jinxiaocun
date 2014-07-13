/**
 * 
 */
package com.wat.jinxiaocun.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Jerome X H Chang
 *
 */
@Entity
@Table(name = "jxc_user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6238944957638476460L;
	@Id
	@Column(name = "jxc_u_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name = "jxc_u_name")
	private String username;
	@Column(name = "jxc_u_pwd")
	private String password;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
