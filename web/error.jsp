<%-- 
    Document   : error
    Created on : Feb 14, 2022, 7:37:38 AM
    Author     : creuma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h1>Erro</h1>
            <h2><%= exception.getMessage() %><br></h2>
        </center>
        </body>
</html>
