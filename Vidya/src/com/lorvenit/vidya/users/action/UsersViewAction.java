package com.lorvenit.vidya.users.action;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lorvenit.vidya.users.beans.UsersRegistrationBeans;
import com.lorvenit.vidya.users.business.UsersViewDao;
import com.opensymphony.xwork2.ActionSupport;

public class UsersViewAction extends ActionSupport implements ServletRequestAware{
	HttpServletRequest request;
	private static final long serialVersionUID = 1L;
private String username;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}


@SuppressWarnings({ "rawtypes" })
public String execute()
{
	 ArrayList list=null;

	WebApplicationContext context =
			WebApplicationContextUtils.getRequiredWebApplicationContext(
                                    ServletActionContext.getServletContext());
	UsersViewDao uvd = (UsersViewDao)context.getBean("UsersViewDao");
	UsersRegistrationBeans uvb = (UsersRegistrationBeans)context.getBean("userregistration");
	 list =(ArrayList)context.getBean("list");
	 
	uvb.setUsername(username);
	int result =uvd.viewuser(uvb,list,request);
	if (result != 0) {
	return "success";
	} else {
		request.setAttribute("result","username is not exit" );
		return "input";
	}

}
	


@Override
public void setServletRequest(HttpServletRequest request) {
	// TODO Auto-generated method stub
	this.request=request;
	
}


}
