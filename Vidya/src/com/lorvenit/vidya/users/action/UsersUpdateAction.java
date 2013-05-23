package com.lorvenit.vidya.users.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lorvenit.vidya.users.business.UsersUpdateDao;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class UsersUpdateAction extends ActionSupport implements ServletRequestAware {
	HttpServletRequest request;
private String username;
@SuppressWarnings("rawtypes")
private ArrayList list;


@SuppressWarnings("rawtypes")
public ArrayList getList() {
	return list;
}

@SuppressWarnings("rawtypes")
public void setList(ArrayList list) {
	this.list = list;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}
@SuppressWarnings({})
public String execute()
{
//	ArrayList<UsersRegistrationBeans> list=null;
	WebApplicationContext context =
			WebApplicationContextUtils.getRequiredWebApplicationContext(
                                    ServletActionContext.getServletContext());
	UsersUpdateDao uud = (UsersUpdateDao)context.getBean("UsersUpdateDao");
//	UsersRegistrationBeans urb= (UsersRegistrationBeans)context.getBean("userregistration");
	 list=uud.userupdateretrive(username,request);
	 if(list==null)
		{
			request.setAttribute("result","username does not exists.");
			return "input";
		}

			else
			{
			return "success";
			
		}
}

public void setServletRequest(HttpServletRequest request) {
	this.request=request;
	
}
}
