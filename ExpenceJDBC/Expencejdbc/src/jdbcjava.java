import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcjava {
    public static void main(String[] args){
        String username ="root";
        String password="";
        String url="jdbc:mysql://localhost:3307/expencedb";
        try {
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Database connection");
            String insertdata = " insert into expencetb"
                    + " values (?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(insertdata);
            preparedStmt.setString(1,"food");
            preparedStmt.setInt(2,100);
//            preparedStmt.setString(3,"mm");
//            preparedStmt.setInt(4,100);
            preparedStmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Database is not connected"+e);
        }
    }
}
