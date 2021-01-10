<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--    <%@page import="entity.*"%>--%>
<%--<jsp:useBean id="courseMgr" class="entity.CourseMgr" scope="application"/>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Admin</title>
</head>
<body>
<p>管理员</p>
<p>&nbsp;</p>

<p>课程列表:</p>
<table width="948" height="233" border="1">
    <tr>
        <td>课程编号</td>
        <td>课程名字</td>
        <td>课程类型</td>
        <td>课程学分</td>
        <td>课程学时</td>
        <td>删除</td>
    </tr>
 
<% 
    java.util.ArrayList<Course> courseList = new java.util.ArrayList<Course>();
	courseList = courseMgr.getCourseList();	
	for(Course course : courseList){
		String courseTypeName = "";
		switch(course.getCourseType()){
		case 2:
			courseTypeName = "ѡ�޿�";
			break;
		case 1:
			courseTypeName = "���޿�";
			break;
		case 0:
			courseTypeName = "������";
			break;
		}
%>
      <tr>
      
    <td align="center"><%=course.getCourseID()%></td>
    <td align="center"><%=course.getCourseName()%></td>
    <td align="center"><%=courseTypeName %></td>
    <td align="center"><%=course.getCourseCredit()%></td>
    <td align="center"><%=course.getCourseHour()%></td>   
    <td align="center">
    <a href="CourseServlet?operation=del&courseID=<%=course.getCourseID()%>" onclick='return window.confirm("This course will be deleted. Are you sure?")'>ɾ��</a>
    </td>
    
  </tr>
 
</table>
<p>&nbsp;</p>
</body>
</html>