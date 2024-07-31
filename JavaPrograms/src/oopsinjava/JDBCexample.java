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
 String url = "jdbc:mysql:// localhost:3307/javaTraining";
 // to make the connection
  try {
     Connection conn = DriverManager.getConnection(url,username,password);
      System.out.println("Database connection established ");
  }catch(SQLException e){
   throw new RuntimeException("database not connected "+e);
  }

    }
}

