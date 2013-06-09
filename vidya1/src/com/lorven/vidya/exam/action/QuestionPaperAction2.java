package com.lorven.vidya.exam.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lorven.vidya.exam.business.InsertExamInterface;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class QuestionPaperAction2 extends ActionSupport implements
		ServletRequestAware {

	private String examcode, examHours, examMinutes, question, answerType,
			option1, option2, option3, option4, option5, option6, option7,
			option8, option9, option10, correctAnswer, eassayAnswer;

	private String checkbox1, checkbox2, checkbox3, checkbox4, checkbox5;

	public String getCheckbox1() {
		return checkbox1;
	}

	public void setCheckbox1(String checkbox1) {
		this.checkbox1 = checkbox1;
	}

	public String getCheckbox2() {
		return checkbox2;
	}

	public void setCheckbox2(String checkbox2) {
		this.checkbox2 = checkbox2;
	}

	public String getCheckbox3() {
		return checkbox3;
	}

	public void setCheckbox3(String checkbox3) {
		this.checkbox3 = checkbox3;
	}

	public String getCheckbox4() {
		return checkbox4;
	}

	public void setCheckbox4(String checkbox4) {
		this.checkbox4 = checkbox4;
	}

	public String getCheckbox5() {
		return checkbox5;
	}

	public void setCheckbox5(String checkbox5) {
		this.checkbox5 = checkbox5;
	}

	public String getEassayAnswer() {
		return eassayAnswer;
	}

	public void setEassayAnswer(String eassayAnswer) {
		this.eassayAnswer = eassayAnswer;
	}

	public String getCorrectAnswer() {

		System.out.println(correctAnswer);
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getAnswerType() {
		return answerType;
	}

	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}

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

	public String getQuestion() {
		if (question != null) {
			return question.trim();
		} else {
			return question;
		}

	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getOption5() {
		return option5;
	}

	public void setOption5(String option5) {
		this.option5 = option5;
	}

	public String getOption6() {
		return option6;
	}

	public void setOption6(String option6) {
		this.option6 = option6;
	}

	public String getOption7() {
		return option7;
	}

	public void setOption7(String option7) {
		this.option7 = option7;
	}

	public String getOption8() {
		return option8;
	}

	public void setOption8(String option8) {
		this.option8 = option8;
	}

	public String getOption9() {
		return option9;
	}

	public void setOption9(String option9) {
		this.option9 = option9;
	}

	public String getOption10() {
		return option10;
	}

	public void setOption10(String option10) {
		this.option10 = option10;
	}

	public Date getConductingDate() {

		return conductingDate;
	}

	public void setConductingDate(Date conductingDate) {
		this.conductingDate = conductingDate;
	}

	HttpServletRequest servletRequest = null;

	public void validate() {
		
		if(answerType.equals("0"))
		{
			this.addFieldError("answerType", "Please select answer type.");
		}
		
		if (answerType.equals("1")) {
			if ((option2.equals("") || option2.length() == 0)
					|| (option3.equals("") || option3.length() == 0)
					|| (option4.equals("") || option4.length() == 0)
					|| (option1.equals("") || option1.length() == 0)
					|| (option5.equals("") || option5.length() == 0)) {
				this.addFieldError("optionsValues",
						"Please fill up all options");

			}
			if (correctAnswer == null) {
				this.addFieldError("selectAnswer",
						getText("Please select correctAnswer"));
			}
			
			if(option1!=null)
			{
				option1=option1.trim();
			}
			if(option2!=null)
			{
				option2=option2.trim();
			}
			if(option3!=null)
			{
				option3=option3.trim();
			}
			if(option5!=null)
			{
				option5=option5.trim();
			}
			if(option4!=null)
			{
				option4=option4.trim();
			}

			if ((option1.equals(option2) || option1.equals(option3) || option1.equals(option4) || option1.equals(option5))
					|| (option2.equals(option1) || option2.equals(option3) || option2.equals(option4) || option2.equals(option5))
					|| (option3.equals(option1) || option3.equals(option2) || option3.equals(option4) || option3.equals(option5))
					|| (option4.equals(option1) || option4.equals(option2) || option4.equals(option3) || option4.equals(option5))
					|| (option5.equals(option1) || option5.equals(option2) || option5.equals(option3) || option5.equals(option4)))
			{
				this.addFieldError("equalOptions", "Options con't be same.");
			}

		}
		if (answerType.equals("2")) {
			if ((option6.equals("") || option6.length() == 0)
					|| (option7.equals("") || option7.length() == 0)
					|| (option8.equals("") || option8.length() == 0)
					|| (option9.equals("") || option9.length() == 0)
					|| (option10.equals("") || option10.length() == 0)) {
				this.addFieldError("optionsValues",
						"Please fill up all options");

			}
			if (checkbox1 == null && checkbox2 == null && checkbox3 == null
					&& checkbox4 == null && checkbox5 == null) {
				this.addFieldError("selectAnswer",
						getText("Please select correctAnswers"));
			}
			
			if(option6!=null)
			{
				option6=option6.trim();
			}
			if(option7!=null)
			{
				option7=option7.trim();
			}
			if(option8!=null)
			{
				option8=option8.trim();
			}
			if(option9!=null)
			{
				option9=option9.trim();
			}
			if(option10!=null)
			{
				option10=option10.trim();
			}

			if ((option6.equals(option7) || option6.equals(option8) || option6.equals(option9) || option6.equals(option10))
					|| (option7.equals(option6) || option7.equals(option8) || option7.equals(option9) || option7.equals(option10))
					|| (option8.equals(option6) || option8.equals(option7) || option8.equals(option9) || option8.equals(option10))
					|| (option9.equals(option6) || option9.equals(option8) || option9.equals(option7) || option9.equals(option10))
					|| (option10.equals(option6) || option10.equals(option9) || option10.equals(option8) || option10.equals(option7)))
			{
				this.addFieldError("equalOptions", "Options con't be same.");
			}
		}
	}

	// inserting question papers

	public String insertExamDetails() {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(ServletActionContext
						.getServletContext());
		InsertExamInterface examInterface = (InsertExamInterface) context
				.getBean("insertExamDao");
		QuestionPaperAction2 questionPaperAction = (QuestionPaperAction2) context
				.getBean("questionPaperActions");

		if (answerType.equals("3")) {
			correctAnswer = "";
		}

		if (answerType.equals("2")) {
			option1 = option6;
			option2 = option7;
			option3 = option8;
			option4 = option9;
			option5 = option10;

			if (checkbox1 == null) {
				checkbox1 = "";
			}
			if (checkbox2 == null) {
				checkbox2 = "";
			}
			if (checkbox3 == null) {
				checkbox3 = "";
			}
			if (checkbox4 == null) {
				checkbox4 = "";
			}
			if (checkbox5 == null) {
				checkbox5 = "";
			}
			correctAnswer = checkbox1 + checkbox2 + checkbox3 + checkbox4
					+ checkbox5;

			if (checkbox1 == null && checkbox1 == null && checkbox1 == null
					&& checkbox1 == null && checkbox1 == null) {
				correctAnswer = "ABCDEF";
			}

		}

		HttpSession ses = servletRequest.getSession();
		examcode = (String) ses.getAttribute("examcode");
		examHours = (String) ses.getAttribute("examHours");
		examMinutes = (String) ses.getAttribute("examMinutes");

		System.out.println(servletRequest.getAttribute("conductingDate"));

		questionPaperAction.setExamcode(examcode);
		questionPaperAction.setExamHours(examHours);
		questionPaperAction.setExamMinutes(examMinutes);
		questionPaperAction.setConductingDate((Date) ses
				.getAttribute("conductingDate"));
		questionPaperAction.setEassayAnswer(eassayAnswer);
		questionPaperAction.setQuestion(question);
		questionPaperAction.setAnswerType(answerType);
		questionPaperAction.setOption1(option1);
		questionPaperAction.setOption2(option2);
		questionPaperAction.setOption3(option3);
		questionPaperAction.setOption4(option4);
		questionPaperAction.setOption5(option5);
		questionPaperAction.setCorrectAnswer(correctAnswer);

		String msg = examInterface.insertExamDetails(questionPaperAction);
		servletRequest.setAttribute("result",
				"Your question successfully stored");

		return msg;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {

		servletRequest = request;
	}

}
