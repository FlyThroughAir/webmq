<%--
  Created by IntelliJ IDEA.
  User: FYZBXX
  Date: 2019/5/26 0026
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<c:out value="${time}"></c:out>--%>
<form action="/onsend" method="post">
    <input value="${time}" name="message" readonly="readonly">
    <input type="submit" value="提交" />
</form>
</body>
</html>
