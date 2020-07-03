<%--
  Created by IntelliJ IDEA.
  User: liaochen
  Date: 2020/7/2
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>成功执行页面</title>
</head>
<body>
<h3>方法执行成功</h3>

    <c:forEach items="${accounts}" var="account">
        ${account.name}
        ${account.money}
    </c:forEach>
</body>
</html>
