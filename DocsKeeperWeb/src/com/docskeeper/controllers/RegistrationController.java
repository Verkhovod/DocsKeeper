package com.docskeeper.controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.docskeeper.model.dao.LoginInfoDao;

@ManagedBean
public class RegistrationController {

	private String userName;
	private String password;

	@EJB
	private LoginInfoDao loginDao;

	public String login() {
		try {
			getRequest().login(userName, password);
//			LoginInfo loginInfo = loginDao.getUserDataByLogin(userName);
			//TODO: try to check if it is possible to identify user here using getUserInfo()... 
		} catch (ServletException exp) {
			return null;
		}
		return "";
	}

	public static HttpServletRequest getRequest() {
		return (HttpServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
