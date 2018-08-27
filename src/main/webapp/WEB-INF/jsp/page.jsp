<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr />
<br />
<table border="1px" cellpadding="0" cellspacing="0" >
<tr bgcolor="yellow">
<td>STUDENT_ID</td>
<td>STUDENT_NAME</td>
<td>STUDENT_SEX</td>
<td>STUDENT_AGE</td>
<td>STUDENT_BIRTHDAY</td>
<td>STUDENT_CLASS</td>
</tr>
<c:forEach items="${stuList }" var="s">
<tr>
<td>${s.stu_id }</td>
<td>${s.stu_name }</td>
<td>${s.stu_sex }</td>
<td>${s.stu_age }</td>
<td><f:formatDate value="${s.stu_birthday }" pattern="yyyy-MM-dd"/></td>
<td>${s.stu_class }</td>
</tr>
</c:forEach>
</table>
<a href="getStudentPage.do?pageItem=${minpage}">首页</a>
<a href="getStudentPage.do?pageItem=${pageItem-1}">上一页</a>
<a href="getStudentPage.do?pageItem=${pageItem+1}">下一页</a>
<a href="getStudentPage.do?pageItem=${maxpage}">末页</a>
<br />
<hr />
<br />
</body>
</html>