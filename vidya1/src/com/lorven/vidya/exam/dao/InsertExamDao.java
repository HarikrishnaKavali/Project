package com.lorven.vidya.exam.dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.lorven.vidya.exam.action.QuestionPaperAction2;
import com.lorven.vidya.exam.business.InsertExamInterface;

public class InsertExamDao extends SqlMapClientDaoSupport implements InsertExamInterface {

	@Override
	public String insertExamDetails(QuestionPaperAction2 questionPaperAction) {
		
		String msg=(String)getSqlMapClientTemplate().queryForObject("insertExamDetails",questionPaperAction);
		if(msg!=null)
		{
			return "success";
		}
		else
		{
			return "failure";
		}
		
		
	}

}
