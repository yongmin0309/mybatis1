package com.mybatis.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {
	public static SqlSession getSession() {
		
		String fileName="mybatis-config.xml";
		SqlSession session = null;
		
		try {
			
		
			 session = new SqlSessionFactoryBuilder().build(is).openSession(false);
			
		}catch (IOException e) {
			e.printStackTrace(); //에러로그확인용
		}
		return session;
		
	}
}
