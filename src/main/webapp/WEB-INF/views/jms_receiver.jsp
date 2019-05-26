<%--
  Created by IntelliJ IDEA.
  User: FYZBXX
  Date: 2019/5/26 0026
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>收到消息了！</h1>
    <c:out value="${textMessage}"></c:out>
    <a href="/welcome">回到主页！</a>
</body>
</html>
