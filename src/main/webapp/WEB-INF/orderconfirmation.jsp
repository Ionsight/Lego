<%-- 
    Document   : orderconfirmation
    Created on : 22-03-2018, 15:21:51
    Author     : Dradrach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Order Confirmation</h1>
        <form name = showorders action="FrontController" method = "POST">
            <input type="hidden" name="command" value="showorders">
            <input type="submit" value="Show orders">
        </form>
    </body>
</html>
