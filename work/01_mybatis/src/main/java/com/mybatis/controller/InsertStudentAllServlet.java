package com.mybatis.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.servide.StudentService;
import com.mybatis.model.vo.Student;

/**
 * Servlet implementation class InsertStudentAll
 */
@WebServlet("/student/insertstudentall.do")
public class InsertStudentAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertStudentAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	//클라이언트가 보낸 데이터를 DB에 저장하는 기능
	//클라이언트가 보낸 데이터는 getParameter(), getParameterValues()
	// getParameter() string 반환
	// getParamterValues() String[]반환 -> 다수값
		
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
	//DB에 저장	
		
		
		Student s = new Student();
		s.setStudentName(name);
		s.setStudentTel(tel);
		s.setStudentEmail(email);
		s.setStudentAddr(address);
		

		int result= new StudentService().insertStudentAll(s);
		System.out.println(result);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
