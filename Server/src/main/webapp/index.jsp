<html>
<body>
<%
String keyword = request.getParameter("keyword");
switch(keyword){
case "google":
response.sendRedirect("http://www.google.com");
break;
case "facebook":
response.sendRedirect("http://www.facebook.com");
break;
case "youtube":
response.sendRedirect("http://www.youtube.com");
}
%>
</body>
</html>
