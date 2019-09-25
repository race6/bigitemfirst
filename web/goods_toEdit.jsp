<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-09-25
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品编辑页面</title>
    <style>
        table{
            margin-top: 200px;
            line-height: 20px;
            font-family: 微软雅黑;
            width: 250px;
        }
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/goodsServlet?method=updateGoods" method="post">
    <input type="hidden" name="g_id" value="${Goods.g_id}"/>

    <table align="center" border="1">
        <tr>
            <td>
                商品名称
            </td>
            <td>
                <input type="text" name="g_goods_name" value="${Goods.g_goods_name}"/>
            </td>
        </tr>
        <tr>
            <td>
                商品图片
            </td>
            <td>
                <input type="text" name="g_goods_pic" value="${Goods.g_goods_pic}"/>
            </td>
        </tr>
        <tr>
            <td>
                商品价格
            </td>
            <td>
                <input type="text" name="g_goods_price" value="${Goods.g_goods_price}"/>
            </td>
        </tr>
        <tr>
            <td>
                商品描述
            </td>
            <td>
                <input type="text" name="g_goods_description" value="${Goods.g_goods_description}"/>
            </td>
        </tr>
        <tr>
            <td>
                商品库存
            </td>
            <td>
                <input type="text" name="g_goods_stock" value="${Goods.g_goods_stock}"/>
            </td>
        </tr>
        <tr>
            <td>
                商品状态
            </td>
            <td>
                <input type="text" name="is_delete" value="${Goods.is_delete}"/>
            </td>
        </tr>
        <tr align="center">
            <td colspan="2"><input type="submit" value="提交"/></td>
        </tr>


    </table>

</form>


</body>
</html>