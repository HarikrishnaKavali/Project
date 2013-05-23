package com.lorvenit.vidya.login.business;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lorvenit.vidya.login.beans.LoginBeans;
public interface LoginDao {
public int verify(LoginBeans la, HttpServletRequest request, HttpServletResponse response);
}
