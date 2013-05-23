package com.lorvenit.vidya.login.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.lorvenit.vidya.login.beans.LoginBeans;
import com.lorvenit.vidya.login.business.LoginDao;
import com.lorvenit.vidya.users.beans.UsersRegistrationBeans;

public class LoginDaoImp extends SqlMapClientDaoSupport implements LoginDao{
	@SuppressWarnings({ "unchecked",  })
	public int verify(LoginBeans la, HttpServletRequest request,
			HttpServletResponse response) {
		int result = 0;
		String usersmanagment = null;
		String uinsert = null;
		String uupdate = null;
		String uview = null;
		String udelete = null;
		String username = null;
		String studentmanagment = null;
		String sinsert = null;
		String supdate = null;
		String sview = null;
		String sdelete = null;
		String employeemanagment = null;
		String einsert = null;
		String eupdate = null;
		String eview = null;
		String edelete = null;
		String facultymanagment = null;
		String finsert = null;
		String fupdate = null;
		String fview = null;
		String fdelete = null;
		String batchmanagment = null;
		String binsert = null;
		String bupdate = null;
		String bview = null;
		String bdelete = null;
		String coursemanagment = null;
		String cinsert = null;
		String cupdate = null;
		String cview = null;
		String cdelete = null;
		String exammanagment = null;
		String exinsert = null;
		String exupdate = null;
		String exview = null;
		String exdelete = null;
		String librarymanagment = null;
		String liinsert = null;
		String liupdate = null;
		String liview = null;
		String lidelete = null;
		String labmanagement = null;
		String lainsert = null;
		String laupdate = null;
		String laview = null;
		String ladelete = null;

		try {
			// userCount =
			// (Integer)getSqlMapClientTemplate().queryForObject("getAll",la);

			List<UsersRegistrationBeans> list = (List<UsersRegistrationBeans>) getSqlMapClientTemplate().queryForList("getAll", la);
			if (list != null) {
				for (UsersRegistrationBeans list1 : list) {
					usersmanagment = list1.getUsersmanagment();
					System.out.println(usersmanagment);
					studentmanagment = list1.getStudentmanagment();
					employeemanagment = list1.getEmployeemanagment();
					facultymanagment = list1.getFacultymanagment();
					batchmanagment = list1.getBatchmanagment();
					coursemanagment = list1.getCoursemanagment();
					exammanagment = list1.getExammanagment();
					librarymanagment = list1.getLibrarymanagment();
					labmanagement = list1.getLabmanagement();
					username = list1.getUsername();
					System.out.println(username);
					result++;
					
				}
			}
			if (usersmanagment != null) {
				request.setAttribute("usersmanagment",usersmanagment);
				List<UsersRegistrationBeans> lu = (List<UsersRegistrationBeans>) getSqlMapClientTemplate()
						.queryForList("getAllu", username);
				for (UsersRegistrationBeans listu : lu) {
					username = listu.getUsername();
					uinsert = listu.getUinsert();
					uupdate = listu.getUupdate();
					uview = listu.getUview();
					udelete = listu.getUdelete();
					result++;
				}
				if (uinsert != null) {
					request.setAttribute("uinsert", uinsert);
				}

				if (uupdate != null) {
					request.setAttribute("uupdate", uupdate);
				}

				if (uview != null) {
					request.setAttribute("uview", uview);

				}
				if (udelete != null) {
					request.setAttribute("udelete", udelete);
				}
			}
			if (studentmanagment != null) {
				request.setAttribute("studentmanagment",studentmanagment);
				List<UsersRegistrationBeans> ls = (List<UsersRegistrationBeans>) getSqlMapClientTemplate()
						.queryForList("getAlls", username);
				for (UsersRegistrationBeans lists : ls) {
					username = lists.getUsername();
					sinsert = lists.getSinsert();
					supdate = lists.getSupdate();
					sview = lists.getSview();
					sdelete = lists.getSdelete();
					result++;
				}
				if (sinsert != null) {
					request.setAttribute("sinsert", sinsert);
				}

				if (supdate != null) {
					request.setAttribute("supdate", supdate);
				}

				if (sview != null) {
					request.setAttribute("sview", sview);

				}
				if (sdelete != null) {
					request.setAttribute("sdelete", sdelete);
				}
			}
			if (employeemanagment != null) {
				request.setAttribute("employeemanagment",employeemanagment);
				List<UsersRegistrationBeans> le = (List<UsersRegistrationBeans>) getSqlMapClientTemplate()
						.queryForList("getAlle", username);
				for (UsersRegistrationBeans liste : le) {
					username = liste.getUsername();
					einsert = liste.getEinsert();
					eupdate = liste.getEupdate();
					eview = liste.getEview();
					edelete = liste.getEdelete();
					result++;
				}
				if (einsert != null) {
					request.setAttribute("einsert", einsert);
				}

				if (eupdate != null) {
					request.setAttribute("eupdate", eupdate);
				}

				if (eview != null) {
					request.setAttribute("eview", eview);

				}
				if (edelete != null) {
					request.setAttribute("edelete", edelete);
				}
			}
			
			if (facultymanagment != null) {
				request.setAttribute("facultymanagment",facultymanagment);
				List<UsersRegistrationBeans> lf = (List<UsersRegistrationBeans>) getSqlMapClientTemplate()
						.queryForList("getAllf", username);
				for (UsersRegistrationBeans listf : lf) {
					username = listf.getUsername();
					finsert = listf.getFinsert();
					fupdate = listf.getFupdate();
					fview = listf.getFview();
					fdelete = listf.getFdelete();
					result++;
				}
				if (finsert != null) {
					request.setAttribute("finsert", finsert);
				}

				if (fupdate != null) {
					request.setAttribute("fupdate", fupdate);
				}

				if (fview != null) {
					request.setAttribute("fview", fview);

				}
				if (fdelete != null) {
					request.setAttribute("fdelete", fdelete);
				}
			}
			
			if (batchmanagment != null) {
				request.setAttribute("batchmanagment",batchmanagment);
				List<UsersRegistrationBeans> lb = (List<UsersRegistrationBeans>) getSqlMapClientTemplate()
						.queryForList("getAllb", username);
				for (UsersRegistrationBeans listb : lb) {
					username = listb.getUsername();
					binsert = listb.getBinsert();
					bupdate = listb.getBupdate();
					bview = listb.getBview();
					bdelete = listb.getBdelete();
					result++;
				}
				if (binsert != null) {
					request.setAttribute("binsert", binsert);
				}

				if (bupdate != null) {
					request.setAttribute("bupdate", bupdate);
				}

				if (bview != null) {
					request.setAttribute("bview", bview);

				}
				if (bdelete != null) {
					request.setAttribute("bdelete", bdelete);
				}
			}
			
			if (coursemanagment != null) {
				request.setAttribute("coursemanagment",coursemanagment);
				List<UsersRegistrationBeans> lc = (List<UsersRegistrationBeans>) getSqlMapClientTemplate()
						.queryForList("getAllc", username);
				for (UsersRegistrationBeans listc : lc) {
					username = listc.getUsername();
					cinsert = listc.getCinsert();
					cupdate = listc.getCupdate();
					cview = listc.getCview();
					cdelete = listc.getCdelete();
					result++;
				}
				if (cinsert != null) {
					request.setAttribute("cinsert", cinsert);
				}

				if (cupdate != null) {
					request.setAttribute("cupdate", cupdate);
				}

				if (cview != null) {
					request.setAttribute("cview", cview);

				}
				if (cdelete != null) {
					request.setAttribute("cdelete", cdelete);
				}
			}
	
				if (exammanagment != null) {
						request.setAttribute("exammanagment",exammanagment);
						List<UsersRegistrationBeans> lex = (List<UsersRegistrationBeans>) getSqlMapClientTemplate()
								.queryForList("getAllex", username);
						for (UsersRegistrationBeans listex : lex) {
							username = listex.getUsername();
							exinsert = listex.getExinsert();
							exupdate = listex.getExupdate();
							exview = listex.getExview();
							exdelete = listex.getExdelete();
							result++;
						}
						if (exinsert != null) {
							request.setAttribute("exinsert", exinsert);
						}

						if (exupdate != null) {
							request.setAttribute("exupdate", exupdate);
						}

						if (exview != null) {
							request.setAttribute("exview", exview);

						}
						if (exdelete != null) {
							request.setAttribute("exdelete", exdelete);
						}
					}
		
						if (librarymanagment != null) {
							request.setAttribute("librarymanagment",librarymanagment);
							List<UsersRegistrationBeans> lli = (List<UsersRegistrationBeans>) getSqlMapClientTemplate()
									.queryForList("getAllli", username);
							for (UsersRegistrationBeans listli : lli) {
								username = listli.getUsername();
								liinsert = listli.getLiinsert();
								liupdate = listli.getLiupdate();
								liview = listli.getLiview();
								lidelete = listli.getLidelete();
								result++;
							}
							if (liinsert != null) {
								request.setAttribute("liinsert", liinsert);
							}

							if (liupdate != null) {
								request.setAttribute("liupdate", liupdate);
							}

							if (liview != null) {
								request.setAttribute("liview", liview);

							}
							if (lidelete != null) {
								request.setAttribute("lidelete", lidelete);
							}
						}
					
								if (labmanagement != null) {
									request.setAttribute("labmanagement",labmanagement);
									List<UsersRegistrationBeans> lla = (List<UsersRegistrationBeans>) getSqlMapClientTemplate()
											.queryForList("getAllla", username);
									for (UsersRegistrationBeans listla : lla) {
										username = listla.getUsername();
										lainsert = listla.getLainsert();
										laupdate = listla.getLaupdate();
										laview = listla.getLaview();
										ladelete = listla.getLadelete();
										result++;
									}
									if (lainsert != null) {
										request.setAttribute("lainsert", lainsert);
									}

									if (laupdate != null) {
										request.setAttribute("laupdate", laupdate);
									}

									if (laview != null) {
										request.setAttribute("laview", laview);

									}
									if (ladelete != null) {
										request.setAttribute("ladelete", ladelete);
									}
								}
		} catch (Exception ex) {
			ex.printStackTrace();
			return 0;
		}
		return result;
	}


}