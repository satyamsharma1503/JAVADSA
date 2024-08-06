package oopsinjava;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCexample {

 public static void main(String[]args) throws SQLException {
// establish the database connection
// 1. url , username , password database name
 String username = "root";
 String password = "";
 String url = "jdbc:mysql:// localhost:3307/javatrainer";
 // to make the connection
  try {
     Connection conn = DriverManager.getConnection(url,username,password);
      System.out.println("Database connection established ");
      String sql = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
           + " values (?, ?, ?, ?, ?)";
  }catch(SQLException e){
   throw new RuntimeException("database not connected "+e);
  }

    }
}

