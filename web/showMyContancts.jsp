<%--
  Created by IntelliJ IDEA.
  User: longliying
  Date: 2019/8/17
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <from action="ContactsServlet?action=showMyContancts" method="post">
        <table border="1"  cellspacing="0">
            <thead>
                <tr>
                    <th>姓名</th>
                    <th>电话</th>
                    <th>地址</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items ="${list}" var = "Contacts">
                    <tr>
                        <td>${Contacts.username}</td>
                        <td>${Contacts.phone}</td>
                        <td>${Contacts.adress}</td>
                        <td>
                            <a href="#">删除</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
            <tfoot></tfoot>
        </table>
    </from>

</body>
</html>
