package com.lorvenit.vidya.users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class UsersUpdateRetriveAction extends ActionSupport implements ServletRequestAware {
	HttpServletRequest request;
	private static final long serialVersionUID = 2460891776144317929L;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String repassword;
	private String passwordhint;
	private String email;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getPasswordhint() {
		return passwordhint;
	}

	public void setPasswordhint(String passwordhint) {
		this.passwordhint = passwordhint;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String execute() {
		HttpSession ses = request.getSession();
		ses.setAttribute("firstname", firstname);
		ses.setAttribute("lastname", lastname);
		ses.setAttribute("username", username);
		ses.setAttribute("password", password);
		ses.setAttribute("repassword", repassword);
		ses.setAttribute("passwordhint", passwordhint);
		ses.setAttribute("email", email);
		return "success";

	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}
