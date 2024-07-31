package oopsinjava;

import java.sql.SQLException;

public class jdbc {
    private static Object DriverManager;

    public static void main(String[] args) throws SQLException {
// establish the database connection
// 1. url , username , password database name
        String username = "root";
        String password = "";
        String url = "jdbc:mysql:// localhost:3307/javaTraining";
        // to make the connection
//        Connection conn = DriverManager.getConnection(url,username,password);
    }
}
