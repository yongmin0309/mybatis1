package com.mybatis.model.dao;

import org.apache.ibatis.session.SqlSession;

public class StudentDao {
	public int insertStudent(SqlSession session) {
		
		int result=session.insert("student.insertStudent");
		
		return result;
	}
}
