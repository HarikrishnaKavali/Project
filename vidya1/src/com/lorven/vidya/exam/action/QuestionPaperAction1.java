package com.lorven.vidya.exam.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class QuestionPaperAction1 extends ActionSupport implements
		ServletRequestAware {

	private String examcode, examHours, examMinutes;

	private Date conductingDate;

	public String getExamcode() {
		return examcode;
	}

	public void setExamcode(String examcode) {
		this.examcode = examcode;
	}

	public String getExamHours() {
		return examHours;
	}

	public void setExamHours(String examHours) {
		this.examHours = examHours;
	}

	public String getExamMinutes() {
		return examMinutes;
	}

	public void setExamMinutes(String examMinutes) {
		this.examMinutes = examMinutes;
	}

	public Date getConductingDate() {

		return conductingDate;
	}

	public void setConductingDate(Date conductingDate) {
		this.conductingDate = conductingDate;
	}

	HttpServletRequest servletRequest = null;

	public String execute() {
		HttpSession ses = servletRequest.getSession();
		ses.setAttribute("examcode", examcode);
		ses.setAttribute("examHours", examHours);
		ses.setAttribute("examMinutes", examMinutes);
		ses.setAttribute("conductingDate", conductingDate);
	//	System.out.println("action1 "+servletRequest.getParameter("conductingDate"));
		servletRequest.setAttribute("conductingDate", servletRequest.getParameter("conductingDate"));
		return "success";

	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {

		servletRequest = request;

	}

}
