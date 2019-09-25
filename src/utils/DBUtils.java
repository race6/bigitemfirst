package utils;

import java.sql.*;

public class DBUtils {

    private static String url = DBConfig.getValue("url");
    private static String username = DBConfig.getValue("username");
    private static String password = DBConfig.getValue("password");

    static {
        //注册驱动
        try {
            Class.forName(DBConfig.getValue("driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    /**
     * 关闭相关的连接
     * @param rs
     * @param stmt
     * @param conn
     */
    public static void closeConnection(ResultSet rs, Statement stmt,Connection conn){

        try {
            if(rs!=null){
                rs.close();
            }
            if(stmt!=null){
                stmt.close();
            }
            if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



}
