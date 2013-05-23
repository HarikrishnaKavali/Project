package com.lorvenit.vidya.users.dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.lorvenit.vidya.users.business.UsersDeleteDao;

public class UsersDeleteDaoImp extends SqlMapClientDaoSupport implements UsersDeleteDao{

int count=0;
	public int delete(String username) {
		try
		{
		System.out.println(username);
		count =(Integer) getSqlMapClientTemplate().delete("deleteusers", username);
		count =(Integer) getSqlMapClientTemplate().delete("deleteusersu", username);

		count =(Integer) getSqlMapClientTemplate().delete("deleteuserss", username);	

		count =(Integer) getSqlMapClientTemplate().delete("deleteuserse", username);

		count =(Integer) getSqlMapClientTemplate().delete("deleteusersf", username);

		count =(Integer) getSqlMapClientTemplate().delete("deleteusersb", username);	

		count =(Integer) getSqlMapClientTemplate().delete("deleteusersc", username);

		count =(Integer) getSqlMapClientTemplate().delete("deleteusersex", username);
		System.out.println("fddbfvcvcb");
		count =(Integer) getSqlMapClientTemplate().delete("deleteusersli", username);
		count =(Integer) getSqlMapClientTemplate().delete("deleteusersla", username);
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


