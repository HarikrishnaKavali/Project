package com.lorvenit.vidya.users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lorvenit.vidya.users.beans.UsersRegistrationBeans;
import com.lorvenit.vidya.users.business.UsersRegistrationDao;
import com.opensymphony.xwork2.ActionSupport;

public class UsersRegistrationCheckAction extends ActionSupport implements ServletRequestAware {
	HttpServletRequest request;

	
	private static final long serialVersionUID = -7053238280230608217L;
	private String usersmanagment;
	private String uinsert;
	private String uupdate;
	private String uview;
	private String udelete;
	private String studentmanagment;
	private String sinsert;
	private String supdate;
	private String sview;
	private String sdelete;
	private String employeemanagment;
	private String einsert;
	private String eupdate;
	private String eview;
	private String edelete;
	private String facultymanagment;
	private String finsert;
	private String fupdate;
	private String fview;
	private String fdelete;
	private String batchmanagment;
	private String binsert;
	private String bupdate;
	private String bview;
	private String bdelete;
	private String coursemanagment;
	private String cinsert;
	private String cupdate;
	private String cview;
	private String cdelete;
	private String exammanagment;
	private String exinsert;
	private String exupdate;
	private String exview;
	private String exdelete;
	private String librarymanagment;
	private String liinsert;
	private String liupdate;
	private String liview;
	private String lidelete;
	private String labmanagement;
	private String lainsert;
	private String laupdate;
	private String laview;
	private String ladelete;
	public String getUsersmanagment() {
		return usersmanagment;
	}
	public void setUsersmanagment(String usersmanagment) {
		this.usersmanagment = usersmanagment;
	}
	public String getUinsert() {
		return uinsert;
	}
	public void setUinsert(String uinsert) {
		this.uinsert = uinsert;
	}
	public String getUupdate() {
		return uupdate;
	}
	public void setUupdate(String uupdate) {
		this.uupdate = uupdate;
	}
	public String getUview() {
		return uview;
	}
	public void setUview(String uview) {
		this.uview = uview;
	}
	public String getUdelete() {
		return udelete;
	}
	public void setUdelete(String udelete) {
		this.udelete = udelete;
	}
	public String getStudentmanagment() {
		return studentmanagment;
	}
	public void setStudentmanagment(String studentmanagment) {
		this.studentmanagment = studentmanagment;
	}
	public String getSinsert() {
		return sinsert;
	}
	public void setSinsert(String sinsert) {
		this.sinsert = sinsert;
	}
	public String getSupdate() {
		return supdate;
	}
	public void setSupdate(String supdate) {
		this.supdate = supdate;
	}
	public String getSview() {
		return sview;
	}
	public void setSview(String sview) {
		this.sview = sview;
	}
	public String getSdelete() {
		return sdelete;
	}
	public void setSdelete(String sdelete) {
		this.sdelete = sdelete;
	}
	public String getEmployeemanagment() {
		return employeemanagment;
	}
	public void setEmployeemanagment(String employeemanagment) {
		this.employeemanagment = employeemanagment;
	}
	public String getEinsert() {
		return einsert;
	}
	public void setEinsert(String einsert) {
		this.einsert = einsert;
	}
	public String getEupdate() {
		return eupdate;
	}
	public void setEupdate(String eupdate) {
		this.eupdate = eupdate;
	}
	public String getEview() {
		return eview;
	}
	public void setEview(String eview) {
		this.eview = eview;
	}
	public String getEdelete() {
		return edelete;
	}
	public void setEdelete(String edelete) {
		this.edelete = edelete;
	}
	public String getFacultymanagment() {
		return facultymanagment;
	}
	public void setFacultymanagment(String facultymanagment) {
		this.facultymanagment = facultymanagment;
	}
	public String getFinsert() {
		return finsert;
	}
	public void setFinsert(String finsert) {
		this.finsert = finsert;
	}
	public String getFupdate() {
		return fupdate;
	}
	public void setFupdate(String fupdate) {
		this.fupdate = fupdate;
	}
	public String getFview() {
		return fview;
	}
	public void setFview(String fview) {
		this.fview = fview;
	}
	public String getFdelete() {
		return fdelete;
	}
	public void setFdelete(String fdelete) {
		this.fdelete = fdelete;
	}
	public String getBatchmanagment() {
		return batchmanagment;
	}
	public void setBatchmanagment(String batchmanagment) {
		this.batchmanagment = batchmanagment;
	}
	public String getBinsert() {
		return binsert;
	}
	public void setBinsert(String binsert) {
		this.binsert = binsert;
	}
	public String getBupdate() {
		return bupdate;
	}
	public void setBupdate(String bupdate) {
		this.bupdate = bupdate;
	}
	public String getBview() {
		return bview;
	}
	public void setBview(String bview) {
		this.bview = bview;
	}
	public String getBdelete() {
		return bdelete;
	}
	public void setBdelete(String bdelete) {
		this.bdelete = bdelete;
	}
	public String getCoursemanagment() {
		return coursemanagment;
	}
	public void setCoursemanagment(String coursemanagment) {
		this.coursemanagment = coursemanagment;
	}
	public String getCinsert() {
		return cinsert;
	}
	public void setCinsert(String cinsert) {
		this.cinsert = cinsert;
	}
	public String getCupdate() {
		return cupdate;
	}
	public void setCupdate(String cupdate) {
		this.cupdate = cupdate;
	}
	public String getCview() {
		return cview;
	}
	public void setCview(String cview) {
		this.cview = cview;
	}
	public String getCdelete() {
		return cdelete;
	}
	public void setCdelete(String cdelete) {
		this.cdelete = cdelete;
	}
	public String getExammanagment() {
		return exammanagment;
	}
	public void setExammanagment(String exammanagment) {
		this.exammanagment = exammanagment;
	}
	public String getExinsert() {
		return exinsert;
	}
	public void setExinsert(String exinsert) {
		this.exinsert = exinsert;
	}
	public String getExupdate() {
		return exupdate;
	}
	public void setExupdate(String exupdate) {
		this.exupdate = exupdate;
	}
	public String getExview() {
		return exview;
	}
	public void setExview(String exview) {
		this.exview = exview;
	}
	public String getExdelete() {
		return exdelete;
	}
	public void setExdelete(String exdelete) {
		this.exdelete = exdelete;
	}
	public String getLibrarymanagment() {
		return librarymanagment;
	}
	public void setLibrarymanagment(String librarymanagment) {
		this.librarymanagment = librarymanagment;
	}
	public String getLiinsert() {
		return liinsert;
	}
	public void setLiinsert(String liinsert) {
		this.liinsert = liinsert;
	}
	public String getLiupdate() {
		return liupdate;
	}
	public void setLiupdate(String liupdate) {
		this.liupdate = liupdate;
	}
	public String getLiview() {
		return liview;
	}
	public void setLiview(String liview) {
		this.liview = liview;
	}
	public String getLidelete() {
		return lidelete;
	}
	public void setLidelete(String lidelete) {
		this.lidelete = lidelete;
	}
	public String getLabmanagement() {
		return labmanagement;
	}
	public void setLabmanagement(String labmanagement) {
		this.labmanagement = labmanagement;
	}
	public String getLainsert() {
		return lainsert;
	}
	public void setLainsert(String lainsert) {
		this.lainsert = lainsert;
	}
	public String getLaupdate() {
		return laupdate;
	}
	public void setLaupdate(String laupdate) {
		this.laupdate = laupdate;
	}
	public String getLaview() {
		return laview;
	}
	public void setLaview(String laview) {
		this.laview = laview;
	}
	public String getLadelete() {
		return ladelete;
	}
	public void setLadelete(String ladelete) {
		this.ladelete = ladelete;
	}
		
public String execute()
{
	
	WebApplicationContext context =
			WebApplicationContextUtils.getRequiredWebApplicationContext(
                                    ServletActionContext.getServletContext());
	UsersRegistrationDao urd = (UsersRegistrationDao)context.getBean("UsersRegistrationDao");
	UsersRegistrationBeans urb= (UsersRegistrationBeans)context.getBean("userregistration");
	HttpSession ses=request.getSession();
	String firstname =(String)ses.getAttribute("firstname");
	String lastname = (String)ses.getAttribute("lastname");
	String username = (String)ses.getAttribute("username");
	String password = (String)ses.getAttribute("password");
	String repassword = (String)ses.getAttribute("repassword");
	String passwordhint = (String)ses.getAttribute("passwordhint");
	String email = (String)ses.getAttribute("email");
	urb.setFirstname(firstname);
	urb.setLastname(lastname);
	urb.setUsername(username);
	urb.setPassword(password);
	urb.setRepassword(repassword);
	urb.setPasswordhint(passwordhint);
	urb.setEmail(email);
	urb.setUsersmanagment(usersmanagment);
	urb.setUinsert(uinsert);
	urb.setUupdate(uupdate);
	urb.setUview(uview);
	urb.setUdelete(udelete);
	urb.setStudentmanagment(studentmanagment);
	urb.setSinsert(sinsert);
	urb.setSupdate(supdate);
	urb.setSview(sview);
	urb.setSdelete(sdelete);
	urb.setFacultymanagment(facultymanagment);
	urb.setFinsert(finsert);
	urb.setFupdate(fupdate);
	urb.setFview(fview);
	urb.setFdelete(fdelete);
	urb.setEmployeemanagment(employeemanagment);
	urb.setEinsert(einsert);
	urb.setEupdate(eupdate);
	urb.setEview(eview);
	urb.setEdelete(edelete);
	urb.setBatchmanagment(batchmanagment);
	urb.setBinsert(binsert);
	urb.setBupdate(bupdate);
	urb.setBview(bview);
	urb.setBdelete(bdelete);
	urb.setCoursemanagment(coursemanagment);
	urb.setCinsert(cinsert);
	urb.setCupdate(cupdate);
	urb.setCview(cview);
	urb.setCdelete(cdelete);
	urb.setExammanagment(exammanagment);
	urb.setExinsert(exinsert);
	urb.setExupdate(exupdate);
	urb.setExview(exview);
	urb.setExdelete(exdelete);
	urb.setLibrarymanagment(librarymanagment);
	urb.setLiinsert(liinsert);
	urb.setLiview(liview);
	urb.setLiupdate(liupdate);
	urb.setLidelete(lidelete);
	urb.setLabmanagement(labmanagement);
	urb.setLainsert(lainsert);
	urb.setLaupdate(laupdate);
	urb.setLaview(laview);
	urb.setLadelete(ladelete);
	String count=urd.userinsert(urb);
	if(count !=null)
	{
	return "success";
	}
	else
	{
	return "login";
	}
}
public void setServletRequest(HttpServletRequest request) {
	this.request = request;
}

}