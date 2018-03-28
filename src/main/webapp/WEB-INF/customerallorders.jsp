<%-- 
    Document   : customerorders
    Created on : 28-03-2018, 09:12:45
    Author     : Dradrach
--%>

<%@page import="FunctionLayer.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>See your orders!</h1>
        <% List<Order> orders = (ArrayList) request.getAttribute("orders");
            if (orders != null) {
                for (Order order : orders) {
                    String orderLine = "Orderid: " + order.getId() + ", height " + order.getHeight()
                            + ", width: " + order.getWidth() + ", length: " + order.getLength();
        %> 
        <form name = specificorder action="FrontController" method = "POST">
            <input type="hidden" name="command" value="specificorder">
            <input type="hidden" name="orderid" value="<%= order.getId() %>">
            <input type="hidden" name="height" value="<%= order.getHeight()%>">
            <input type="hidden" name="width" value="<%= order.getWidth()%>">
            <input type="hidden" name="length" value="<%= order.getLength() %>">
            <input type="submit" value="<% out.print(orderLine); %>">
        </form>
        <br> <%
                }
            }%>
    </body>
</html>
