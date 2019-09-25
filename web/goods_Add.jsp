<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-09-24
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品添加页面</title>
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
<form action="${pageContext.request.contextPath}/goodsServlet?method=addGoods" method="post">
    <table align="center" border="1">
        <tr>
            <td>
                商品名称
            </td>
            <td>
                <input type="text" name="g_goods_name" placeholder="请输入商品名称"/>
            </td>
        </tr>
        <tr>
            <td>
                商品图片
            </td>
            <td>
                <input type="text" name="g_goods_pic" placeholder="请上传商品图片"/>
            </td>
        </tr>
        <tr>
            <td>
                商品价格
            </td>
            <td>
                <input type="text" name="g_goods_price" placeholder="请输入商品价格"/>
            </td>
        </tr>
        <tr>
            <td>
                商品描述
            </td>
            <td>
                <input type="text" name="g_goods_description" placeholder="请输入商品描述"/>
            </td>
        </tr>
        <tr>
            <td>
                商品库存
            </td>
            <td>
                <input type="text" name="g_goods_stock" placeholder="请输入商品库存"/>
            </td>
        </tr>
        <tr>
            <td>
                商品状态
            </td>
            <td>
                <input type="text" name="is_delete" value="0" placeholder="请输入商品状态"/>
            </td>
        </tr>
        <tr align="center">
            <td colspan="2"><input type="submit"value="提交"/></td>
        </tr>


    </table>

</form>


</body>
</html>
