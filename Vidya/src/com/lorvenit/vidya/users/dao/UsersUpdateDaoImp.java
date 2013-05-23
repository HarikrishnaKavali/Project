package com.lorvenit.vidya.users.dao;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.lorvenit.vidya.users.beans.UsersRegistrationBeans;
import com.lorvenit.vidya.users.business.UsersUpdateDao;

public class UsersUpdateDaoImp extends SqlMapClientDaoSupport implements UsersUpdateDao {

	ArrayList<UsersRegistrationBeans> list=null;
	@SuppressWarnings({ "rawtypes", "unchecked" })

		public ArrayList userupdateretrive(String username, HttpServletRequest request) {
		try {
			
				list =(ArrayList<UsersRegistrationBeans>) getSqlMapClientTemplate().queryForList("userupdateretrive",username);
				for(UsersRegistrationBeans list1:list)
				{
					if(username.equals(list1.getUsername()))
					{
						return  list;
					}
				}
			}
		catch(Exception ex)
		{
	//		System.out.println("hjgfdjg");
//			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Integer userupdate(UsersRegistrationBeans urb) {
		Integer count=0;
		try
		{
		count =(Integer) getSqlMapClientTemplate().update("updateusers", urb);
//		System.out.println(count);
		if(urb.getUsersmanagment()!=null);
		{
		count =(Integer) getSqlMapClientTemplate().update("updateusersu", urb);
		}
		if(urb.getStudentmanagment()!=null);
		{
		count =(Integer) getSqlMapClientTemplate().update("updateuserss", urb);	
		}
		if(urb.getEmployeemanagment()!=null);
		{
		count =(Integer) getSqlMapClientTemplate().update("updateuserse", urb);
		}
		if(urb.getFacultymanagment()!=null);
		{
		count =(Integer) getSqlMapClientTemplate().update("updateusersf", urb);
		}
		if(urb.getBatchmanagment()!=null);
		{
		count =(Integer) getSqlMapClientTemplate().update("updateusersb", urb);	
		}
		if(urb.getCoursemanagment()!=null);
		{
		count =(Integer) getSqlMapClientTemplate().update("updateusersc", urb);
		}
		if(urb.getExammanagment()!=null);
		{
		count =(Integer) getSqlMapClientTemplate().update("updateusersex", urb);
		}
		if(urb.getLibrarymanagment()!=null);
		{
		count =(Integer) getSqlMapClientTemplate().update("updateusersli", urb);
		}
		if(urb.getLabmanagement()!=null);
		{
		count =(Integer) getSqlMapClientTemplate().update("updateusersla", urb);
		}
		}
		catch(Exception ex)
		{
		//	ex.printStackTrace();
			return count;
		}
		System.out.println(count);
		return count;
	}
}
