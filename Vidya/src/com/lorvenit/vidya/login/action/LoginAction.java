package com.lorvenit.vidya.login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lorvenit.vidya.login.beans.LoginBeans;
import com.lorvenit.vidya.login.business.LoginDao;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class LoginAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{
	HttpServletRequest request;
	HttpServletResponse response;
	private static final long serialVersionUID = -7482540747212919573L;
	private String username;
	private String password;
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

	public String execute() {

		WebApplicationContext context =
				WebApplicationContextUtils.getRequiredWebApplicationContext(
	                                    ServletActionContext.getServletContext());
//		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource(
//				"com/form/spring_ibatismap/spring_ibatisMapping.xml"));
		LoginDao ld = (LoginDao)context.getBean("LoginDaoImp");
		LoginBeans la = (LoginBeans)context.getBean("LoginAction");
		la.setUsername(username);
		la.setPassword(password);
		int i = ld.verify(la,request,response);
		if (i !=0) {
			return ActionSupport.SUCCESS;
		}  
		else 
		{
			addFieldError("username", "Invalid Username/Password. Please try again");
		//	return ActionSupport.INPUT;
		}
		return ActionSupport.INPUT;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
		
	}
	public HttpServletRequest getRequest() {
		return request;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response=response;
	}
	public HttpServletResponse getResponse() {
		return response;
	}

}
