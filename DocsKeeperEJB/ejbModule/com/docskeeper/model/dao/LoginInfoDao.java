package com.docskeeper.model.dao;

import javax.ejb.Local;

import com.docskeeper.model.entries.LoginInfo;

/**
 * Dao interface for login information
 * 
 * @author a.pryshchepa
 * @email vinglfm@gmail.com
 */
@Local
public interface LoginInfoDao {
	/**
	 * @param login
	 *            login specified by user
	 * @return {@link LoginInfo} - if user is already registered, </br> {@code null} - otherwise
	 */
	LoginInfo getUserDataByLogin(String login);
}
