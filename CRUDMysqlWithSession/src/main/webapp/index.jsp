<html>
<body>
<%--add the jsp code scriptlet--%>
<%
// to get the data from index html page using request
String taskName= request.getParameter("taskName");
String taskDescription = request.getParameter("taskDescription");
// to print the value
out.print("taskName "+taskName+"taskDescription "+taskDescription);

//to add the data into session
session.setAttribute("taskName",taskName);
session.setAttribute("taskDescription",taskDescription);

//to navigate the task jsp page
response.sendRedirect("http://localhost:8089/CRUDMysqlWithSession/task.jsp");
%>
</body>
</html>
