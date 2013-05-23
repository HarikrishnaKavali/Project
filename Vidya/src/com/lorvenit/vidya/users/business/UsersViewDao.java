package com.lorvenit.vidya.users.business;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import com.lorvenit.vidya.users.beans.UsersRegistrationBeans;

public interface UsersViewDao {

	@SuppressWarnings("rawtypes")
	public int viewuser(UsersRegistrationBeans uvb, ArrayList list, HttpServletRequest request);

}
