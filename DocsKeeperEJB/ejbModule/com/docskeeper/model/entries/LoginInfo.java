package com.docskeeper.model.entries;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.docskeeper.model.AuthRights;

@Entity
public class LoginInfo {

	@Id
	@NotNull
	private String login;

	@NotNull
	private String password;

	@NotNull
	@Enumerated(EnumType.STRING)
	private AuthRights rights;

	public LoginInfo() {		
	}
	
	public LoginInfo(String login, String password, AuthRights rights) {
		this.setLogin(login);
		this.password = password;
		this.setRights(rights);
	}
	

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public AuthRights getRights() {
		return rights;
	}

	public void setRights(AuthRights rights) {
		this.rights = rights;
	}

}
