<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/18
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${articles}" var="item">
        ${item.userID }--${item.userName }<br />
    </c:forEach>
</body>
</html>
