package servlet;

import dao.GoodsDao;
import dao.GoodsDaoImpl;
import domain.Goods;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/goodsServlet")
public class GoodsServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");

        String method=request.getParameter("method");
        if ("list".equals(method)){
            show_list(request,response);
        }else if ("addGoods".equalsIgnoreCase(method)){
            System.out.println("添加商品他来了");
            addGoods(request,response);
        }else if ("Edit".equals(method)){//method=Edit&g_id=2
            System.out.println("编辑页面");
            Edit(request,response);

        }else if("updateGoods".equals(method)){
            updateGoods(request,response);

        }else if ("DeleteOne".equals(method)){
            DeleteOne(request,response);
        }else if ("Removeselected".equals(method)){
            Removeselected(request,response);
        }


    }
    private void show_list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("展示列表他来了。");
        GoodsDao goodsDao = new GoodsDaoImpl();
        List<Goods> goodsList = goodsDao.getGoodsList();
        System.out.println(goodsList);
        request.setAttribute("list",goodsList);
        request.getRequestDispatcher("/goods_Show.jsp").forward(request,response);


    }

    private void dellogdata(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("注销登录他来了");
        HttpSession session = request.getSession();
        session.setAttribute("username","");
    }
    private void addGoods(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

         String g_goods_name=request.getParameter("g_goods_name");
         String g_goods_pic=request.getParameter("g_goods_pic");
         float g_goods_price=Float.parseFloat( request.getParameter("g_goods_price"));
         String g_goods_description=request.getParameter("g_goods_description");
         int g_goods_stock=Integer.parseInt(request.getParameter("g_goods_stock"));
         int is_delete=Integer.parseInt(request.getParameter("is_delete"));
         Goods goods = new Goods(1, g_goods_name, g_goods_pic, g_goods_price, g_goods_description, g_goods_stock, is_delete);
         GoodsDao goodsDao = new GoodsDaoImpl();
         int result = goodsDao.addGoods(goods);
        System.out.println("result:"+result);
         if (result>0){
             PrintWriter writer = response.getWriter();
             writer.write("添加成功！");
             String url = "/goodsServlet?method=list";
             request.getRequestDispatcher(url).forward(request,response);

         }else if (result==-1){
             PrintWriter writer = response.getWriter();
             writer.write("添加失败！");

         }else {
             response.sendRedirect(request.getContextPath()+"/error.jsp");
         }

    }

    private void Edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int g_id = Integer.parseInt(request.getParameter("g_id"));
        GoodsDao goodsDao=new GoodsDaoImpl();
        Goods goods = goodsDao.queryone(g_id);
        request.setAttribute("Goods",goods);
        request.getRequestDispatcher("/goods_toEdit.jsp").forward(request,response);
    }
    private void updateGoods(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int g_id=Integer.parseInt(request.getParameter("g_id"));
        String g_goods_name=request.getParameter("g_goods_name");
        String g_goods_pic=request.getParameter("g_goods_pic");
        float g_goods_price=Float.parseFloat( request.getParameter("g_goods_price"));
        String g_goods_description=request.getParameter("g_goods_description");
        int g_goods_stock=Integer.parseInt(request.getParameter("g_goods_stock"));
        int is_delete=Integer.parseInt(request.getParameter("is_delete"));
        Goods goods = new Goods(g_id, g_goods_name, g_goods_pic, g_goods_price, g_goods_description, g_goods_stock, is_delete);
        GoodsDao goodsDao = new GoodsDaoImpl();
        int result = goodsDao.updateGoods(goods);
        if (result>0){
            response.setContentType("text/html; charset=utf-8");
            PrintWriter writer = response.getWriter();
            writer.write("更新成功！");
        }else if (result==-1){
            response.setContentType("text/html; charset=utf-8");
            PrintWriter writer = response.getWriter();
            writer.write("更新失败！");

        }else {
            response.sendRedirect("/error.jsp");
        }



    }
    private void DeleteOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int g_id=Integer.parseInt(request.getParameter("g_id"));
        GoodsDao goodsDao=new GoodsDaoImpl();
        int i = goodsDao.deleteOne(g_id);
        if (i>0){
            response.setContentType("text/html; charset=utf-8");
            PrintWriter writer = response.getWriter();
            writer.write("删除成功！");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            request.getRequestDispatcher("/goods_Show.jsp").forward(request,response);
        }else if (i==-1){
            response.setContentType("text/html; charset=utf-8");
            PrintWriter writer = response.getWriter();
            writer.write("删除失败！");

        }else {
            response.sendRedirect("/error.jsp");
        }



    }
    private void Removeselected(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }


}
