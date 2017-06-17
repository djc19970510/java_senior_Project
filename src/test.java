import Util.DButil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by dingjiacheng on 2017/6/16.
 */
public class test {
    public static void main(String[] args) {
        String sql = "select * from message where id>?";
        Connection conn = DButil.getConnection();
        int i=0;
//        try{
//            while(true) {
//                PreparedStatement pst = conn.prepareStatement(sql);
//                pst.setInt(1,i);
//                ResultSet rs = pst.executeQuery();
//                while (rs.next()) {
//                    i = rs.getInt(1);
//                    System.out.println(rs.getString(2));
//                    System.out.println(rs.getInt(3));
//                }
//                rs.close();
//                pst.close();
//            }
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
    }
}
