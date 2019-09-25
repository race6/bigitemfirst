package dao;

import domain.Goods;
import utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodsDaoImpl implements GoodsDao {
    @Override
    public List<Goods> getGoodsList() {
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        try {
            conn = DBUtils.getConnection();
            String mysql = "select * from goods where is_delete=0";
            pstmt = conn.prepareStatement(mysql);
            rs = pstmt.executeQuery();
            List<Goods> list=new ArrayList<>();
            while (rs.next()){
                /*
                `g_id` int(255) NOT NULL AUTO_INCREMENT,
                `g_goods_name` varchar(255) DEFAULT NULL,
                `g_goods_pic` varchar(255) DEFAULT NULL,
                `g_goods_price` decimal(10,2) DEFAULT NULL,
                `g_goods_description` varchar(255) DEFAULT NULL,
                `g_goods_stock` int(255) DEFAULT NULL,
                `is_delete` int(1) DEFAULT NULL,
                 */

                int g_id=rs.getInt("g_id");
                String g_goods_name=rs.getString("g_goods_name");
                String g_goods_pic=rs.getString("g_goods_pic");
                float g_goods_price=rs.getFloat("g_goods_price");
                String g_goods_description=rs.getString("g_goods_description");
                int g_goods_stock=rs.getInt("g_goods_stock");
                int is_delete=rs.getInt("is_delete");
                Goods g = new Goods(g_id,g_goods_name,g_goods_pic,g_goods_price,g_goods_description,g_goods_stock,is_delete);
                list.add(g);
            }
            return list;


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeConnection(rs,pstmt,conn);
        }


        return null;
    }

    @Override
    public int addGoods(Goods goods) {
                /*
                `g_id` int(255) NOT NULL AUTO_INCREMENT,
                `g_goods_name` varchar(255) DEFAULT NULL,
                `g_goods_pic` varchar(255) DEFAULT NULL,
                `g_goods_price` decimal(10,2) DEFAULT NULL,
                `g_goods_description` varchar(255) DEFAULT NULL,
                `g_goods_stock` int(255) DEFAULT NULL,
                `is_delete` int(1) DEFAULT NULL,
                 */
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        try {
            conn = DBUtils.getConnection();
            String sql="insert into goods(g_goods_name,g_goods_pic,g_goods_price,g_goods_description,g_goods_stock,is_delete) " +
                    "values(?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,goods.getG_goods_name());
            pstmt.setString(2,goods.getG_goods_pic());
            pstmt.setFloat(3,goods.getG_goods_price());
            pstmt.setString(4,goods.getG_goods_description());
            pstmt.setInt(5,goods.getG_goods_stock());
            pstmt.setInt(6,goods.getIs_delete());

            //受影响的条数：
            int result = pstmt.executeUpdate();

            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }
        return -1;
    }

    @Override
    public Goods queryone(int g_id) {
        Connection conn=null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;
        Goods g=null;

        try {
            conn=DBUtils.getConnection();
            String sql="select * from goods where g_id=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,g_id);
            rs = pstmt.executeQuery();
            while (rs.next()){
                g_id=rs.getInt("g_id");
                String g_goods_name=rs.getString("g_goods_name");
                String g_goods_pic=rs.getString("g_goods_pic");
                float g_goods_price=rs.getFloat("g_goods_price");
                String g_goods_description=rs.getString("g_goods_description");
                int g_goods_stock=rs.getInt("g_goods_stock");
                int is_delete=rs.getInt("is_delete");
                g = new Goods(g_id,g_goods_name,g_goods_pic,g_goods_price,g_goods_description,g_goods_stock,is_delete);
            }
            return g;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeConnection(rs,pstmt,conn);

        }

        return null;
    }

    @Override
    public int updateGoods(Goods goods) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            conn=DBUtils.getConnection();
            String sql1 = "delete from goods where g_id="+goods.getG_id();
            String sql2="insert into goods(g_id,g_goods_name,g_goods_pic,g_goods_price,g_goods_description,g_goods_stock,is_delete) " +
                    "values(?,?,?,?,?,?,?)";
            int i = conn.prepareStatement(sql1).executeUpdate();
            if (i>0){
                System.out.println("删除数据成功");
            }
            pstmt=conn.prepareStatement(sql2);
            pstmt.setInt(1,goods.getG_id());
            pstmt.setString(2,goods.getG_goods_name());
            pstmt.setString(3,goods.getG_goods_pic());
            pstmt.setFloat(4,goods.getG_goods_price());
            pstmt.setString(5,goods.getG_goods_description());
            pstmt.setInt(6,goods.getG_goods_stock());
            pstmt.setInt(7,goods.getIs_delete());
            int i1 = pstmt.executeUpdate();

            return i1;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeConnection(rs,pstmt,conn);
        }
        return -1;
    }

    @Override
    public int deleteOne(int g_id) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        try {
            conn=DBUtils.getConnection();
            String sql = "update goods set is_delete=1 where g_id="+g_id;
            System.out.println("deleteOne sql:"+sql);
            pstmt = conn.prepareStatement(sql);
            int i = pstmt.executeUpdate();
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeConnection(rs,pstmt,conn);

        }

        return -1;
    }

    @Override
    public int deleteGoods(String[] g_id) {
        return 0;
    }
}
