package com.lorvenit.vidya.users.action;

import com.opensymphony.xwork2.ActionSupport;

public class UsersLinkAction extends ActionSupport{

	private static final long serialVersionUID = -5065588787260605489L;
private String link;

public String getLink() {
	return link;
}

public void setLink(String link) {
	this.link = link;
}

public String execute()
{
//	System.out.println(link);
	return "success";
}
}
