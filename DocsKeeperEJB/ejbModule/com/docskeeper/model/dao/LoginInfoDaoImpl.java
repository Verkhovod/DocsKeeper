package com.docskeeper.model.dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.docskeeper.model.entries.LoginInfo;

@Stateless
@LocalBean
public class LoginInfoDaoImpl implements LoginInfoDao {

	@Override
	public LoginInfo getUserDataByLogin(String login) {
		//TODO: getEntityManager - try to use Spring...
		return null;
	}

}
