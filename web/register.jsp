<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-09-24
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户注册</title>
    <style>
        body{
            background-image: url("${pageContext.request.contextPath}/img/2bg.jpg");
            background-repeat: no-repeat;
            background-position: center;
        }

        div{
            border: 5px;
            color: orange;

        }
        table{

            line-height: 40px;
            /*width: 400px;*/
            margin-top: 150px;
            border-radius: 5px;

        }
        submit{
            horiz-align: center;
        }
        tr{
            color: white;
        }

    </style>
    <script>
        function user() {
            var flag=false;
            var uNode=document.getElementById("u_username");
            var uContent=uNode.value;
            var usercheckNode=document.getElementById("usercheck")
            var reg=new RegExp("^[a-z].{3,15}$");
            if (uContent=="") {
                usercheckNode.innerHTML="用户名为空".fontcolor("red");
                flag=false;

            }else if (reg.test(uContent)) {
                usercheckNode.innerHTML="可用".fontcolor("green");
                flag=true;


            }
            return flag;
        }
        function pswcheck1() {
            var flag=false;
            var p1Node = document.getElementById("u_password1");
            var p1Content=p1.value;
            var psw1check=document.getElementById("passwordcheck1")
            // var p2Content=p2.value;
            var reg = new RegExp(".{5,16}$");
            if (reg.test(p1Content)){
                psw1check.innerHTML="可用".fontcolor("green");
                flag=true;
            }else if (p1Content==""){
                psw1check.innerHTML="用户名不可为空".fontcolor("red");
                flag=false;
            }else {
                psw1check.innerHTML="用户名长度不足".fontcolor("red");
                flag=false;

            }

            return flag;
        }
        function pswcheck2() {
            var flag=false;
            var p1Node = document.getElementById("u_password2");
            var p1Content=p1.value;
            var psw2checkNode = document.getElementById("passwordcheck2");

            var p2Node = document.getElementById("passwordcheck2");
            var p2Content=p2.value;
            var reg = new RegExp(".{5,16}$");
            if (p1Content==p2Content){
                psw2checkNode.innerHTML="输入正确".fontcolor("green");
                flag=true;
            }else if (p2Content==""){
                psw2checkNode.innerHTML="用户名不可为空".fontcolor("red");
                flag=false;
            }else {
                psw2checkNode.innerHTML="用户名长度不足".fontcolor("red");
                flag=false;

            }
            return flag;
        }
        function checkmail() {
            var mailNope=document.getElementById("u_mail");
            var mailContent = mailNope.value;
            var mailcheckNode=document.getElementById("mailcheck");
            var flag=false;
            if (mailContent==""){
                mailcheckNode.innerHTML="邮箱地址为空".fontcolor("red");
                flag=false
            }else {
                mailcheckNode.innerHTML="邮箱正确".fontcolor("green");
                flag=true;
            }
            return flag;
        }

        function checktel() {
            var telNope=document.getElementById("u_tel");
            var telContent = telNope.value;
            var flag=false;
            var telcheckNode=document.getElementById("telcheck");
            if (telContent==""){
                telcheckNode.innerHTML="电话为空".fontcolor("red");
                flag=false
            }else {
                telcheckNode.innerHTML="电话正确".fontcolor("green");
                flag=true;
            }
            return flag;
        }
        function checkverycode() {
            var verycodeNope = document.getElementById("verycode");
            var verycodecheckNope=document.getElementById("verycodecheck");
            var verycodeContent = verycodeNope.value;
            var flag=false;
            if (verycodeContent==""){
                verycodecheckNope.innerHTML="验证码为空".fontcolor("red");
                flag=false
            }else {
                verycodecheckNope.innerHTML="验证码正确".fontcolor("green");
                flag=true;
            }
            return flag;
        }
        
        
        function formcheck() {
            if (user() && pswcheck1() && pswcheck2() && checkmail() && checktel() &&checkverycode() && addcheck()){
                alert("提交成功！")
            }else {
                alert("输入有误，请重新输入！")
            }
            
        }
        
        function addcheck() {
            var flag=false;
            var addNode=document.getElementById("u_address");
            var addContent = addNode.value;
            var addCheckNode=document.getElementById("addresscheck")
            if (addContent==""){
                addCheckNode.innerHTML="地址为空".fontcolor("red");
                flag=false;
            }else {
                addCheckNode.innerHtml="地址正确".fontcolor("green");
            }

            
        }








    </script>
</head>
<body>
    <div align="center">
        <form>
            <table id="table1">
                <tr>
                    <td>
                        用户名
                    </td>
                    <td>
                        <input type="text" name="u_username" id="u_username" placeholder="请输入用户名" />
                    </td>
                </tr>

                <tr>
                    <td>
                        用户密码
                    </td>
                    <td>
                        <input type="password" name="u_password1" id="u_password1" placeholder="请输入密码"/>
                    </td>

                </tr>
                <tr>
                    <td>
                        确认密码
                    </td>
                    <td>
                        <input type="u_password" name="u_password2" id="u_password2" placeholder="请再次输入密码"/>
                    </td>

                </tr>
                <tr>
                    <td>
                        性别
                    </td>
                    <td>
                        <input type="radio" name="u_sex" value="1" checked="checked"/>男<input type="radio" name="u_sex" value="0"/>女
                    </td>
                </tr>
                <tr>
                    <td>
                        爱好
                    </td>
                    <td>
                        <input type="checkbox" name="u_hobbies" value="1"/>篮球
                        <input type="checkbox" name="u_hobbies" value="2"/>羽毛球
                        <input type="checkbox" name="u_hobbies" value="3"/>游泳
                    </td>
                </tr>
                <tr>
                    <td>
                        电话
                    </td>
                    <td>
                        <input type="tel" name="u_tel" placeholder="请输入电话" id="u_tel"/>
                    </td>

                </tr>
                <tr>
                    <td>
                        邮箱
                    </td>
                    <td>
                        <input type="email" name="u_mail" placeholder="请输入邮箱" id="u_mail"/>
                    </td>

                </tr>
                <tr>
                    <td>
                        地址
                    </td>
                    <td>
                        <input type="text" name="u_address" placeholder="请输入地址" id="u_address"/>
                    </td>

                </tr>
                <tr>
                    <td>
                       验证码
                    </td>
                    <td>
                        <input type="text" name="u_address" placeholder="请输入验证码"/>&nbsp;<img src="#" id="verycode"/>
                    </td>

                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="注册" name="submit"/>
                    </td>
                </tr>

            </table>
        </form>
    </div>

</body>
</html>
