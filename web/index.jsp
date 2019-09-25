<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-09-24
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head >
    <title>欢迎使用水果后台管理系统</title>
    <style>
      h1{
        color: white;
      }

      div{
        margin-top: 250px;
      }
      body{
        background-image: url("${pageContext.request.contextPath}/img/2bg.jpg");
        background-repeat: no-repeat;
        background-position: center;
      }




    </style>
    <script>

    </script>
  </head>
  <body>
    <div align="center">
      <h1>欢迎使用水果后台管理系统</h1>
      <br/>
      <br/>
      <br/>
      <br/>
      <br/>
      <a href="login.jsp">用户登录</a>&nbsp;|&nbsp;<a href="register.jsp">用户注册</a>

    </div>
  </body>
</html>
