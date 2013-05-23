package com.lorvenit.vidya.users.business;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.lorvenit.vidya.users.beans.UsersRegistrationBeans;

public interface UsersUpdateDao {

	@SuppressWarnings("rawtypes")
	
	public ArrayList userupdateretrive(String username, HttpServletRequest request);

	public Integer userupdate(UsersRegistrationBeans urb);

}
