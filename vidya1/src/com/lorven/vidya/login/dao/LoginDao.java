package com.lorven.vidya.login.dao;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.lorven.vidya.login.beans.LoginBean;
import com.lorven.vidya.login.business.LoginInterface;

public class LoginDao implements LoginInterface {

	Reader rdr;
		
	public void setRdr(Reader rdr) {
		this.rdr = rdr;
	}


	@Override
	public String login(String uname, String pwd) {

		String msg = null;

		//int rs = 0;
		try {

			Reader rd = Resources.getResourceAsReader("com/lorven/vidya/ibaties/SqlMapConfig.xml");
			SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
			
			//rdr=(Reader)
			
			
			LoginBean lp = new LoginBean();
			lp.setUsername(uname);
			lp.setPassword(pwd);

			String name = null, pass = null;

			
			List<LoginBean> l = (List<LoginBean>) smc.queryForList("com.lorven.vidya.login.beans.LoginBean.getAll", lp);
			for (LoginBean lp1 : l) {
				name = lp1.getUsername();
				pass = lp1.getPassword();
				
				System.out.println("name = "+lp1.getUsername()+"   pass ="+lp1.getPassword());
			}

			if (name != null && pass != null) {
				if (name.equals(uname) && pass.equals(pwd)) {
					msg = "success";
				} else {
					msg = "failure";
				}
			}
			else
			{
				msg="failure";
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return msg;
	}

}
