package com.lorven.vidya.login.action;

import com.lorven.vidya.login.business.LoginInterface;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport{

	LoginInterface log=null;
	
	
	
	private String username,password;

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
	
	public void validate()
	{
		if(username.equals("") || username.length()==0 || username==null)
		{
			this.addFieldError("username", "please enter username");
		}
		if(password.equals("") || password.length()==0 || password==null)
		{
			this.addFieldError("password", "please enter password");
		}
	}
	
	
	public String execute()
	{
		/*XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/lorven/vidya/login/business/beans.xml"));
		log=(LoginInterface)factory.getBean("ldb");		
		String msg=log.login(username, password);*/
		
		return "success";
		
	}
	
}
