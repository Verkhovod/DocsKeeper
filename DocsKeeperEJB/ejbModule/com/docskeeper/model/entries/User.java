package com.docskeeper.model.entries;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class User {

	@Id
	private int userId;

	@NotNull
	private String name;

	@OneToOne(orphanRemoval = true)
	@NotNull
	private LoginInfo loginInfo;
	
	public User() {
		
	}

	public User(String name, LoginInfo loginInfo) {
		this.name = name;
		this.setLoginInfo(loginInfo);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public LoginInfo getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(LoginInfo loginInfo) {
		this.loginInfo = loginInfo;
	}

}
