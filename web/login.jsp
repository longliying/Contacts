<%--
  Created by IntelliJ IDEA.
  User: longliying
  Date: 2019/8/17
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="ContactsServlet?action=login" method="post">
        用户名：<input type="text" name="username"><span style="color: red">${msg}</span><br>
        密码：<input type="password" name="password"><br>
        <input type="checkbox" name="">记住我<br>
        <input type="submit" value="登录">
    </form>

</body>
</html>
