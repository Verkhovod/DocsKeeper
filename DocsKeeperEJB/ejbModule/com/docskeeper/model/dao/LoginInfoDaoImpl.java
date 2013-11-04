package com.docskeeper.model.dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.docskeeper.model.entries.LoginInfo;

/**
 * Implementation of the Dao interface for login info
 * 
 * @author a.pryshchepa
 * @email vinglfm@gmail.com
 */
@Stateless
@LocalBean
public class LoginInfoDaoImpl extends AbstractDao implements LoginInfoDao {

	@Override
	public LoginInfo getUserDataByLogin(String login) {
		return getEntityManager().find(LoginInfo.class, login);
	}

}
