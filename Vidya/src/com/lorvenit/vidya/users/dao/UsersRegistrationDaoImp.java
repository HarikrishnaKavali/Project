package com.lorvenit.vidya.users.dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.lorvenit.vidya.users.beans.UsersRegistrationBeans;
import com.lorvenit.vidya.users.business.UsersRegistrationDao;

public class UsersRegistrationDaoImp extends SqlMapClientDaoSupport implements UsersRegistrationDao {
	String count=null;
	public String userinsert(UsersRegistrationBeans urb) {
		
		try
		{
		count =(String) getSqlMapClientTemplate().insert("insertusers", urb);
		System.out.println(count);
		if(urb.getUsersmanagment()!=null);
		{
		count =(String) getSqlMapClientTemplate().insert("insertusersu", urb);
		}
		if(urb.getStudentmanagment()!=null);
		{
		count =(String) getSqlMapClientTemplate().insert("insertuserss", urb);	
		}
		if(urb.getEmployeemanagment()!=null);
		{
		count =(String) getSqlMapClientTemplate().insert("insertuserse", urb);
		}
		if(urb.getFacultymanagment()!=null);
		{
		count =(String) getSqlMapClientTemplate().insert("insertusersf", urb);
		}
		if(urb.getBatchmanagment()!=null);
		{
		count =(String) getSqlMapClientTemplate().insert("insertusersb", urb);	
		}
		if(urb.getCoursemanagment()!=null);
		{
		count =(String) getSqlMapClientTemplate().insert("insertusersc", urb);
		}
		if(urb.getExammanagment()!=null);
		{
		count =(String) getSqlMapClientTemplate().insert("insertusersex", urb);
		}
		if(urb.getLibrarymanagment()!=null);
		{
		count =(String) getSqlMapClientTemplate().insert("insertusersli", urb);
		}
		if(urb.getLabmanagement()!=null);
		{
		count =(String) getSqlMapClientTemplate().insert("insertusersla", urb);
		System.out.println(count);
		}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		System.out.println(count);
		return count;
	}
	
	}


