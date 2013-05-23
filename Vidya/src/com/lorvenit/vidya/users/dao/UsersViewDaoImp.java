package com.lorvenit.vidya.users.dao;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.lorvenit.vidya.users.beans.UsersRegistrationBeans;
import com.lorvenit.vidya.users.business.UsersViewDao;
public class UsersViewDaoImp extends SqlMapClientDaoSupport implements UsersViewDao
{	
	@SuppressWarnings({ "unchecked", "rawtypes"})
	public int viewuser( UsersRegistrationBeans uvb,ArrayList list, HttpServletRequest request){
		Integer result=0;
//		ArrayList list=new ArrayList();
		try {
		result=(Integer)getSqlMapClientTemplate().queryForObject("viewusersd", uvb);
		if(result !=0)
		{
			
			List<UsersRegistrationBeans> listu = (List<UsersRegistrationBeans>) getSqlMapClientTemplate().queryForList("viewusers", uvb);
			if (listu != null) {
				for (UsersRegistrationBeans list1 : listu) {
					uvb.setFirstname(list1.getFirstname());
	//				System.out.println(list1.getFirstname());
					uvb.setLastname(list1.getLastname());
					uvb.setUsername(list1.getUsername());
					uvb.setPassword(list1.getPassword());
					uvb.setRepassword(list1.getRepassword());
					uvb.setPasswordhint(list1.getPasswordhint());
					uvb.setEmail(list1.getEmail());
					uvb.setUsersmanagment(list1.getUsersmanagment());
					uvb.setStudentmanagment(list1.getStudentmanagment());
					uvb.setEmployeemanagment(list1.getEmployeemanagment());
					uvb.setFacultymanagment(list1.getFacultymanagment());
					uvb.setBatchmanagment(list1.getBatchmanagment());
					uvb.setCoursemanagment(list1.getCoursemanagment());
					uvb.setExammanagment(list1.getExammanagment());
					uvb.setLabmanagement(list1.getLabmanagement());
					uvb.setLibrarymanagment(list1.getLibrarymanagment());
//					result++;	
				}
			
			List<UsersRegistrationBeans> listsu = (List<UsersRegistrationBeans>) getSqlMapClientTemplate().queryForList("viewusers1", uvb);
			if (listsu != null) {
				for (UsersRegistrationBeans list2 : listsu) {
					uvb.setUinsert(list2.getUinsert());
					uvb.setUupdate(list2.getUupdate());
//					System.out.println(list2.getUupdate());
					uvb.setUview(list2.getUview());
					uvb.setUdelete(list2.getUdelete());
//					result++;
				}
			}
			List<UsersRegistrationBeans> listss = (List<UsersRegistrationBeans>) getSqlMapClientTemplate().queryForList("viewusers2", uvb);
			if (listss != null) {
				for (UsersRegistrationBeans list3 : listss) {
					uvb.setSinsert(list3.getSinsert());
					uvb.setSupdate(list3.getSupdate());
					uvb.setSview(list3.getSview());
//					System.out.println(list3.getSinsert());
					uvb.setSdelete(list3.getSdelete());
//					result++;
				}
			}
			List<UsersRegistrationBeans> listse = (List<UsersRegistrationBeans>) getSqlMapClientTemplate().queryForList("viewusers3", uvb);
			if (listse != null) {
				for (UsersRegistrationBeans list4 : listse) {
					uvb.setEinsert(list4.getEinsert());
					uvb.setEupdate(list4.getEupdate());
					uvb.setEview(list4.getEview());
					uvb.setEdelete(list4.getEdelete());
//					result++;
				}
				
			}
			List<UsersRegistrationBeans> listsf = (List<UsersRegistrationBeans>) getSqlMapClientTemplate().queryForList("viewusers4", uvb);
			if (listsf != null) {
				for (UsersRegistrationBeans list5 : listsf) {
					uvb.setFinsert(list5.getFinsert());
					uvb.setFupdate(list5.getFupdate());
					uvb.setFview(list5.getFview());
					uvb.setFdelete(list5.getFdelete());
//					result++;
				}
			}
			List<UsersRegistrationBeans> listsb = (List<UsersRegistrationBeans>) getSqlMapClientTemplate().queryForList("viewusers5", uvb);
			if (listsb != null) {
				for (UsersRegistrationBeans list6 : listsb) {
					uvb.setBinsert(list6.getBinsert());
					uvb.setBupdate(list6.getBupdate());
					uvb.setBview(list6.getBview());
//					System.out.println(list6.getBview());
					uvb.setBdelete(list6.getBdelete());
//					result++;
				}
			}
			List<UsersRegistrationBeans> listsc = (List<UsersRegistrationBeans>) getSqlMapClientTemplate().queryForList("viewusers6", uvb);
			if (listsc != null) {
				for (UsersRegistrationBeans list7 : listsc) {
					uvb.setCinsert(list7.getCinsert());
					uvb.setCupdate(list7.getCupdate());
//					System.out.println(list7.getCview());
					uvb.setCview(list7.getCview());
					uvb.setCdelete(list7.getCdelete());
//					result++;
				}
			}
			List<UsersRegistrationBeans> listsex = (List<UsersRegistrationBeans>) getSqlMapClientTemplate().queryForList("viewusers7", uvb);
			if (listsex != null) {
				for (UsersRegistrationBeans list8 : listsex) {
					uvb.setExinsert(list8.getExinsert());
					uvb.setExupdate(list8.getExupdate());
					uvb.setExview(list8.getExview());
//					System.out.println(list8.getExview());
					uvb.setExdelete(list8.getExdelete());
//					result++;
				}
			}
			List<UsersRegistrationBeans> listsla = (List<UsersRegistrationBeans>) getSqlMapClientTemplate().queryForList("viewusers8", uvb);
			if (listsla != null) {
				for (UsersRegistrationBeans list9 : listsla) {
					uvb.setLainsert(list9.getLainsert());
					uvb.setLaupdate(list9.getLaupdate());
					uvb.setLaview(list9.getLaview());
//					System.out.println(list9.getLaupdate());
					uvb.setLadelete(list9.getLadelete());
//					result++;
				}
			}
			List<UsersRegistrationBeans> listsli = (List<UsersRegistrationBeans>) getSqlMapClientTemplate().queryForList("viewusers9", uvb);
			if (listsli != null) {
				for (UsersRegistrationBeans list10 : listsli) {
					uvb.setLiinsert(list10.getLiinsert());
//					System.out.println(list10.getLiupdate());
					uvb.setLiupdate(list10.getLiupdate());
					uvb.setLiview(list10.getLiview());
					uvb.setLidelete(list10.getLidelete());
//					result++;	
				}	
//				request.setAttribute("users",list);
			}
			list.remove(uvb);
			list.add(uvb);
			request.setAttribute("users",list);
			}
		}
		}
				catch(Exception ex)
				{
					ex.printStackTrace();
					return 0;
				}
	
		return result;
	}
	
}



