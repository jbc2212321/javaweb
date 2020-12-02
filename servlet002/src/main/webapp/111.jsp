<%@ page import="java.util.List" %>
<%@ page import="servlet.User" %><%--
  Created by IntelliJ IDEA.
  User: 78240
  Date: 2020/11/24
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
   List<User>userList= (List<User>) session.getAttribute("user");
   for(User user:userList){
       out.print(user);
   }
    %>
</body>
</html>
