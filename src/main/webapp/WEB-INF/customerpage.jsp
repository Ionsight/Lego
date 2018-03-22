<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
        You are now logged in as a customer of our wonderful site.
        
        <table>
            <tr><td>Login</td>
                <td>
                    <form name="order" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="order">
                        Height:<br>
                        <input type="number" name="height" value="10">
                        <br>
                        Width<br>
                        <input type="number" name="width" value="10">
                        <br>
                        Length<br>
                        <input type="number" name="length" value="10">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>
