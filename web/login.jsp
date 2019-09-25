<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-09-24
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <style>
        table{
            border:  darkgrey;
            border: 1px;
            margin-top: 200px;
            line-height: 25px;
            /*width: 300px;*/
            color: white;
        }
        .sub_button{
            width: 50px;
            background-color: dodgerblue;


        }
        body{
            background-image: url("${pageContext.request.contextPath}/img/2bg.jpg");
        }


    </style>
</head>
<body>
    <div align="center">
        <form method="post" action="#" >
            <table>
                <tr>
                    <td>
                        用户名
                    </td>
                    <td>

                        <input type="text" placeholder="请输入用户名"/>
                    </td>

                </tr>
                <tr>
                    <td>
                        密码
                    </td>
                    <td>
                        <input type="password" name="u_password" placeholder="请输入密码"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        验证码
                    </td>
                    <td>
                        <input type="text" placeholder="请输入验证码" /><input type="image" src="#"/>
                    </td>

                </tr>

                <tr>
                    <td width="100px">
                        <input type="checkbox" name="remember">记住密码
                    </td>
                    <td align="center" rowspan="2" width="250px">
                        <input type="submit" value="登录" class="sub_button">
                    </td>

                </tr>

            </table>

        </form>
    </div>

</body>
</html>
