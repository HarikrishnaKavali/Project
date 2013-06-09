package com.lorven.vidya.exam.dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.lorven.vidya.exam.action.UploadQuestionPaperAction;
import com.lorven.vidya.exam.business.ExamInterface;

public class QuestionPaperDemo extends SqlMapClientDaoSupport implements ExamInterface {

	@Override
	public int insertExamDetails(UploadQuestionPaperAction questionPaper) {
	
		Integer msg=(Integer)getSqlMapClientTemplate().queryForObject("insertExamDetails",questionPaper);
		
		if(msg!=null)
		{
			return 1;
		}
		else	
		{
		return 0;
		}
		
	}

}
