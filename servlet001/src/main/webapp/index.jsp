<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<html>
<head>

    <title>中文</title>

</head>
<body>
<User action="${pageContext.request.contextPath}/login" method="get">
    用户名:<input type="text" name="username"><br>
    密 码:<input type="password" name="password"><br>
    <button type="submit">确认</button>
</User>
</body>
</html>
