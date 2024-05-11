<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mybatis 이용하기</title>
</head>
<body>
	
	<h1>학생조회하기</h1>
	 <h4>
		<a href="${path }/student/searchall.do">학생조회</a>
	</h4> 
	
	
</body>
</html>