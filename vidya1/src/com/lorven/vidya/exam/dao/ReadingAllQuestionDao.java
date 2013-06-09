package com.lorven.vidya.exam.dao;

import java.util.ArrayList;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.lorven.vidya.exam.beans.ReadingQuestionsBean;
import com.lorven.vidya.exam.business.RetrivingAllQuestionPaperInterface;

public class ReadingAllQuestionDao extends SqlMapClientDaoSupport implements
		RetrivingAllQuestionPaperInterface {

	@Override
	public ArrayList<ReadingQuestionsBean> retrivingQuestionPaper(String examcode) {

		@SuppressWarnings("unchecked")
		ArrayList<ReadingQuestionsBean> readingQuestions = (ArrayList<ReadingQuestionsBean>) getSqlMapClientTemplate()
				.queryForList("readingAllQuestionPapers", examcode);
		
		
		//ReadingQuestionsBean beans = null;
		
		/*if(readingQuestions!=null)
		{
			for (ReadingQuestionsBean readingQuestionsBean : readingQuestions) {
				readingQuestions.add(new ReadingQuestionsBean(readingQuestionsBean.getExamCode(),
						readingQuestionsBean.getExamDate(), readingQuestionsBean.getTime_hours(), readingQuestionsBean
								.getTime_minutes(), readingQuestionsBean.getQuestion(), readingQuestionsBean
								.getAnswer_type(), readingQuestionsBean.getOption1(), readingQuestionsBean
								.getOption2(), readingQuestionsBean.getOption3(),
						readingQuestionsBean.getOption4(), readingQuestionsBean.getOption5()));
				
				
			}
		}*/
		

		return readingQuestions;

	}

}
