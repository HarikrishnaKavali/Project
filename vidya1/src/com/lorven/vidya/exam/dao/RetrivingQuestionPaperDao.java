package com.lorven.vidya.exam.dao;

import java.util.ArrayList;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.lorven.vidya.exam.business.RetrivingQuestionPaperInterface;
import com.lorven.vidya.login.beans.ReadingQuestionPaperBean;

public class RetrivingQuestionPaperDao extends SqlMapClientDaoSupport implements RetrivingQuestionPaperInterface {

	@Override
	public ArrayList<ReadingQuestionPaperBean> retrivingQuestionPaper(String examcode) {
		
		@SuppressWarnings("unchecked")
		ArrayList<ReadingQuestionPaperBean> readingQuestions=(ArrayList<ReadingQuestionPaperBean>)getSqlMapClientTemplate().queryForList("readingQuestionPapers",examcode);
		
			return readingQuestions;
		}
		
		
		
	

}
