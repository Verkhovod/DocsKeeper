package com.docskeeper.model.dao;

import javax.ejb.Local;

import com.docskeeper.model.entries.LoginInfo;

@Local
public interface LoginInfoDao {
	LoginInfo getUserDataByLogin(String login);
}
