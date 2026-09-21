<%-- 
    Document   : mainjsp
    Created on : Aug 31, 2026, 11:10:35 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Cookie firstName=new Cookie("first_name",request.getParameter("firt_name"));
    Cookie lastName=new Cookie("last_name",request.getParameter("last_name"));
    
    firstName.setMaxAge(60*60);
    lastName.setMaxAge(60*60);
    
    response.addCookie(firstName);
    response.addCookie(lastName);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Java Server page!</h1>
        <ul>
            <b>First Name</b><%=request.getParameter("first_name")%><br><br>
            <b>Last Name</b><%=request.getParameter("last_name")%>        
    </body>
</html>
