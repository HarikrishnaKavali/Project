package com.lorven.vidya.exam.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ReadingQuestionsBean implements Serializable {

	private String examCode, examDate, time_hours, time_minutes, question, answer_type,
			option1, option2, option3, option4, option5;
	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	public void setTime_hours(String time_hours) {
		this.time_hours = time_hours;
	}

	public void setTime_minutes(String time_minutes) {
		this.time_minutes = time_minutes;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswer_type(String answer_type) {
		this.answer_type = answer_type;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public void setOption5(String option5) {
		this.option5 = option5;
	}

	public ReadingQuestionsBean()
	{
		
	}
	
	public String getExamCode() {
		return examCode;
	}

	public String getExamDate() {
		return examDate;
	}

	public String getTime_hours() {
		return time_hours;
	}

	public String getTime_minutes() {
		return time_minutes;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer_type() {
		return answer_type;
	}

	public String getOption1() {
		return option1;
	}

	public String getOption2() {
		return option2;
	}

	public String getOption3() {
		return option3;
	}

	public String getOption4() {
		return option4;
	}

	public String getOption5() {
		return option5;
	}

	public ReadingQuestionsBean(String examCode, String examDate,
			String time_hours, String time_minutes, String question,
			String answer_type, String option1, String option2, String option3,
			String option4, String option5) {
		super();
		this.examCode = examCode;
		this.examDate = examDate;
		this.time_hours = time_hours;
		this.time_minutes = time_minutes;
		this.question = question;
		this.answer_type = answer_type;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.option5 = option5;
	}

	}
