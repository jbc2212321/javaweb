<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<html>
<head>

    <title>����</title>

</head>
<body>
<User action="${pageContext.request.contextPath}/login" method="get">
    �û���:<input type="text" name="username"><br>
    �� ��:<input type="password" name="password"><br>
    <button type="submit">ȷ��</button>
</User>
</body>
</html>
