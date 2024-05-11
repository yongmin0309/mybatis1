package com.mybatis.model.servide;


import static com.mybatis.common.SqlSessionTemplate.getSession;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.StudentDao;
import com.mybatis.model.vo.Student;

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
	
	public int insertStudentByName(String name) {
		SqlSession session=getSession();
		int result = dao.insertStudentByName(session,name);
		
		if(result>0) session.commit();
		else session.rollback();
		
		session.close();
		
		return result;
	}
	
	public int insertStudentAll(Student s) {
		SqlSession session=getSession();
		int result = dao.insertStudentAll(session,s);
		
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		return result;
	}
	
	public int selectStudentCount() {
		SqlSession session=getSession();
		int result = dao.selectStudentCount(session);
		session.close();
		return result;
	}
	
	public Student selectStudentByNo(int no) {
		SqlSession session=getSession();
		Student s = dao.selectStudentByNo(session,no);
		session.close();
		return s;
	}
}
