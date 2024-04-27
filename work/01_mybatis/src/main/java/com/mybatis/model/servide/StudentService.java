package com.mybatis.model.servide;


import com.mybatis.model.dao.StudentDao;
import org.apache.ibatis.session.*;
import static com.mybatis.common.SqlSessionTemplate.getSession;

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
}
