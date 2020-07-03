<%--
  Created by IntelliJ IDEA.
  User: liaochen
  Date: 2020/7/2
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SSM整合</title>
</head>
<body>
<a href="account/findAll">查询</a>
<hr>
<form action="account/saveAccount" method="post">
    账户姓名：<input type="text" name="name"/><br>
    账户金额：<input type="text" name="money"/><br>
    <input type="submit" value="保存">
</form>
</body>
</html>
