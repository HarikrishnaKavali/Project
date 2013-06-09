package com.lorven.vidya.exam.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lorven.vidya.exam.business.RetrivingQuestionPaperInterface;
import com.lorven.vidya.exam.beans.ReadingQuestionPaperBean;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RetrivingQuestionsAction extends ActionSupport implements ServletRequestAware{

	private HttpServletRequest request=null;
	private String questionPaperCode;

	public String getQuestionPaperCode() {
		return questionPaperCode;
	}

	public void setQuestionPaperCode(String questionPaperCode) {
		this.questionPaperCode = questionPaperCode;
	}

	@SuppressWarnings("unchecked")
	public String execute() {

		ArrayList<ReadingQuestionPaperBean> arrayList=null;
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(ServletActionContext
						.getServletContext());
		RetrivingQuestionPaperInterface questionPaperInterface=(RetrivingQuestionPaperInterface)context.getBean("readingQuestionPapers");
		
		arrayList=questionPaperInterface.retrivingQuestionPaper(questionPaperCode);
		
		if(arrayList!=null)
		{
			request.setAttribute("questions", arrayList);
			return "success";
		}
		else
		{
			return "failure";
		}
		
		
	}

	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		request=servletRequest;
		
	}

}
