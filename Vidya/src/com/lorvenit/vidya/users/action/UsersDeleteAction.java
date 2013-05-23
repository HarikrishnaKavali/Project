package com.lorvenit.vidya.users.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lorvenit.vidya.users.business.UsersDeleteDao;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UsersDeleteAction extends ActionSupport implements ServletRequestAware 
{
	private String username;

	HttpServletRequest request;
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String execute()
	{
		WebApplicationContext context =
				WebApplicationContextUtils.getRequiredWebApplicationContext(
	                                    ServletActionContext.getServletContext());
		UsersDeleteDao udd = (UsersDeleteDao)context.getBean("UsersDeleteDao");
		int result=udd.delete(username);
		if(result!=0)
		{
		request.setAttribute("result","users are successfully deleted.");
		return "success";	
		}
		request.setAttribute("result","usernmae is not exits .");
		return "input";
		
		
	}
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
		
	}
}
