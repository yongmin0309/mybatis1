package com.mybatis.model.service;

import static com.mybatis.common.SqlSessionTemplate.getSession;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.StudentDao;

public class StudentService {
	private StudentDao dao = new StudentDao();
	
	public int insertStudent() {
		SqlSession session=getSession();
		int result = dao.insertStudent(session);
		//트렉젝션처리
		if(result>0) session.commit();
		else session.rollback();
		
		session.close();
		
		return result;
	}
}
