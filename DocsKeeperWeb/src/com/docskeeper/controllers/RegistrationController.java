package com.docskeeper.controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.docskeeper.model.dao.LoginInfoDao;
import com.docskeeper.model.entries.LoginInfo;
import com.docskeeper.utils.SecurityHelper;

/**
 * Controller for registration, login, logout actions
 * 
 * @author a.pryshchepa
 * @email vinglfm@gmail.com
 */
@ManagedBean
public class RegistrationController {

	private String userName;
	private String password;

	@EJB
	private LoginInfoDao loginDao;

	public String login() {
		try {
			getRequest().login(userName, password);
			LoginInfo loginInfo = loginDao.getUserDataByLogin(userName);
			// TODO: Remove call to logout from here. Added just for test
			// purposes
			System.out.println("1");
			logout();
			// TODO: try to check if it is possible to identify user here using
			// getUserInfo()...
		} catch (ServletException exp) {
			System.out.println("2");
			return null;
		}
		return "";
	}

	public void logout() throws ServletException {
		FacesContext.getCurrentInstance().getExternalContext()
				.invalidateSession();
		if (isAuthenticated())
			getRequest().logout();
	}

	private boolean isAuthenticated() {
		return getRequest().getUserPrincipal() != null;
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
