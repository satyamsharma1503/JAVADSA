<html>
<style>
h2{
color:red;
}
</style>
<body>
<%--print any expression or statement--%>
<h2>Hello World!</h2>
<%
out.print("satyam sharma");
%>
<br>
<%= "my email is ss@gmail.com "%>
<%--work on the variables and datatype in jsp with declaration && initialization--%>
<%
//declare the variables in jsp
String collegeName = "BBD";
out.print("<br>"+"my college name is "+collegeName);
%>
<%--ADD TWO NUMBER IN JSP--%>
<%
int a = 4;
int b= 5;
out.print("<br>"+"the sum is: "+(a+b));
%>
<%--Get the request from html page--%>
<%
String friendName = request.getParameter("friendName");
out.print("<br>"+"your friendName :"+friendName);
String friendAge = request.getParameter("friendAge");
out.print("<br>"+"your friendAge :"+friendAge);
String friendGender = request.getParameter("friendGender");
out.print("<br>"+"your friendGender :"+friendGender);
int age = Integer.parseInt(friendAge);
if((age>18 && friendGender.equalsIgnoreCase("male"))||(age>16 && friendGender.equalsIgnoreCase("female")))
{
out.print("<br>"+"you are eligible ");
}
else{
out.print("<br>"+"you are eligible");
}
%>
</body>
</html>
