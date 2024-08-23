<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<html>
<body>
<%--add the jsp code scriptlet--%>
<%
//to get the data  from session and print the data
out.print("the session data "+session.getAttribute("taskName") +session.getAttribute("taskDescription"));
//get the database connection url,username,password into string object
String username="root";
String password="";
String url="jdbc:mysql://localhost:3307/tododb";
//load the connector/ j driver
Class.forName("com.mysql.jdbc.Driver").newInstance();

//to  establish the mysql database connection with jsp & servlet
try{
Connection connection =DriverManager.getConnection(url,username,password);
System.out.println("Database Connected");
//to insert database into tododb
String inserttodo="insert into todotb(taskName,taskDescription) values(?,?)";
PreparedStatement ps= connection.prepareStatement(inserttodo);
//ps.setString(1,"enjoyHoliday");
//ps.setString(2,"Bring sweets for me");
//ps.executeUpdate();
//ystem.out.println("todo inserted");

ps.setString(1,session.getAttribute("taskName").toString());
ps.setString(2,session.getAttribute("taskDescription").toString());
ps.executeUpdate();
System.out.println("todo inserted");

}catch(Exception e)
{
System.out.println(e);
}
%>
</body>
</html>