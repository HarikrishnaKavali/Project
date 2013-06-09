package com.lorven.vidya.exam.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lorven.vidya.exam.business.RetrivingAllQuestionPaperInterface;
import com.lorven.vidya.exam.beans.ReadingQuestionsBean;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RetrivingAllQuestionsAction extends ActionSupport implements
		ServletRequestAware {

	private HttpServletRequest request = null;
	private String questionPaperCode;

	public String getQuestionPaperCode() {
		return questionPaperCode;
	}

	public void setQuestionPaperCode(String questionPaperCode) {
		this.questionPaperCode = questionPaperCode;
	}

	
	
	
	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	@SuppressWarnings("unchecked")
	public String execute() {

		ArrayList<ReadingQuestionsBean> arrayList = null;
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(ServletActionContext
						.getServletContext());
		RetrivingAllQuestionPaperInterface questionPaperInterface = (RetrivingAllQuestionPaperInterface) context
				.getBean("readingAllQuestionPapers");

		arrayList = questionPaperInterface
				.retrivingQuestionPaper(questionPaperCode);

		if (arrayList != null) {
			
			
			request.setAttribute("questions", arrayList);
			return "success";
		} else {
			return "failure";
		}

	}

	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		request = servletRequest;

	}

}
