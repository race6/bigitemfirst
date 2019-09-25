<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-09-24
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品列表展示</title>
    <script>
        function removeGoods() {
            var g_ids=document.getElementById("form").submit;

        }
    </script>
</head>
<body>
<p>
    <a href="${pageContext.request.contextPath}/goodsServlet?method=list">展示商品信息</a>
</p>
<c:if test="${not empty list}">
    <form id="form" action="${pageContext.request.contextPath}/goodsServlet?method=Removeselected" method="post">
    <table border="1px red" align="center">
        <tr><td><input type="checkbox" name="g_id"/></td>
            <td>商品id</td>
            <td>商品名称</td>
            <td>商品图片</td>
            <td>商品价格</td>
            <td>商品简介</td>
            <td>商品库存</td>
            <td>商品状态</td>
            <td>操作</td>
        </tr>
    <c:forEach var="listi" items="${list}" varStatus="status">
        <tr>
            <td><input type="checkbox" name="g_id" id="${listi.g_id}"/></td>
            <td>${listi.g_id}</td>
            <td>${listi.g_goods_name}</td>
            <td>${listi.g_goods_pic}</td>
            <td>${listi.g_goods_price}</td>
            <td>${listi.g_goods_description}</td>
            <td>${listi.g_goods_stock}</td>
            <td>${listi.is_delete}</td>
            <td><a href="${pageContext.request.contextPath}/goodsServlet?method=DeleteOne&g_id=${listi.g_id}">删除</a>|
                <a href="${pageContext.request.contextPath}/goodsServlet?method=Edit&g_id=${listi.g_id}">编辑</a></td>
        </tr>

    </c:forEach>
        <tr>

            <td colspan="9"><a href="${pageContext.request.contextPath}/goods_Add.jsp" >添加商品</a> &nbsp
                <a href="javascript:void(0)" onclick="removeGoods()"/>删除选中</td>
        </tr>

    </table>
    </form>
</c:if>

<%

%>

</body>
</html>
