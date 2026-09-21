
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
