package Util;

/**
 * Created by dingjiacheng on 2017/6/16.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

    /*
     * 数据库工具类
     */
    public class DButil {
        private static final String DATABASE_IP="jdbc:mysql://101.200.44.38:3306/test";
        private static final String DATABASE_USER="root";
        private static final String DATABASE_PASSWD="19970510ding@";

        // 获取数据库连接
        public static Connection getConnection() {
            String driverClassName = "com.mysql.jdbc.Driver";
            String url = DATABASE_IP;
            String user = DATABASE_USER;
            String password = DATABASE_PASSWD;
            Connection conn = null;
            try {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return conn;
        }

        // 关闭所有
        public static void closeAll(ResultSet rs, Statement stmt, Connection conn) {
            try {
                if (rs != null)
                    rs.close();
                if (stmt != null)
                    stmt.close();
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                rs = null;
                stmt = null;
                conn = null;
            }
        }
}
