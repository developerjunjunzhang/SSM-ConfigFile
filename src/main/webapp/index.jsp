<%--
  Created by IntelliJ IDEA.
  User: 军君
  Date: 2020/8/13
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SSM整合首页</title>
</head>
<body>
    <a href="account/findAll" >测试查询所有</a>
    <br>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name" /><br>
        金额：<input type="text" name="money"><br>
        <input type="submit" value="提交" />
    </form>
</body>
</html>
